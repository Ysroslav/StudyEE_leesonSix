package com.gallerycrm.entities;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped

public class TypePictureBean implements Serializable {

    @Inject
    @Model
    private TypePicture type;
    private List<TypePicture> list;

    public TypePictureBean(){
        list = new ArrayList<TypePicture>();
        for(int i = 0; i<3; i++) {
            TypePicture myType = new TypePicture("Type" +(i+1), "short" + i);
            list.add(myType);
        }
    }

    public List<TypePicture> getList(){
        return list;
    }
    public void setList(List<TypePicture> list){this.list = list;}
    public void setType(TypePicture type) {
        this.type = type;
    }

    public String editAction(TypePicture t){
        t.setEditable(true);
        return null;
    }
    public String saveAction(){
        for(TypePicture t : list){
            t.setEditable(false);
        }
        return null;
    }

    public String deleteAction(TypePicture t){
        list.remove(t);
        return null;
    }

    public String addAction(){
        list.add(new TypePicture("New Type", "short"));
        return null;
    }

}
