package com.gallerycrm.entities;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Named
@SessionScoped

public class Sale implements Serializable {

    @NotNull(message = "Поле не должно быть пустым")
    private Picture picture;
    @NotNull(message = "Поле не должно быть пустым")
    private double prize;
    @NotNull(message = "Поле не должно быть пустым")
    private String manager;
    boolean editable;

    public Sale(){}
    public Sale(Picture picture, double prize, String manager){

        this.picture = picture;
        this.prize = prize;
        this.manager = manager;
    }

    public void setPicture(Picture picture){this.picture = picture;}
    public void setPrize(double prize){this.prize = prize;}
    public void setEditable(boolean editable){this.editable = editable;}

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManager(){return manager;}
    public Picture getPicture(){return picture;}

    public double getPrize() {
        return prize;
    }
    public boolean getEditable(){return editable;}
}
