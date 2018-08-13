package com.gallerycrm.entities;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.faces.annotation.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.*;

@Named
@SessionScoped
//@ViewScoped
//@ManagedBean
public class PictureBean implements Serializable {

    @Inject @Model
    private Picture picture;
    private List<Picture> list;

    public PictureBean(){
        list = new ArrayList<Picture>();
        for(int i = 0; i<5; i++) {
            Picture picture = new Picture("Picture" +(i+1), "XZ10" + i, 200+i*10);
            list.add(picture);
        }
    }

    public List<Picture> getList(){
        return list;
    }

    public void setList(List<Picture> list){this.list = list;}

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    private void add(Picture picture){list.add(picture);}


    public String editAction(Picture p){
        p.setEditable(true);
        return null;
    }
    public String saveAction(){
       for(Picture p : list){
           p.setEditable(false);
       }
       return null;
    }

    public String deleteAction(Picture p){
        list.remove(p);
        return null;
    }

    public String addAction(){
        list.add(new Picture("New Picture", "0000", 0));
        return null;
    }




    private String getRequestParameter(String name) {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        return ec.getRequestParameterMap().get(name);
    }
}
