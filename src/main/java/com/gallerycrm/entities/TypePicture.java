package com.gallerycrm.entities;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Named
@SessionScoped

public class TypePicture implements Serializable {
    @NotNull(message = "Поле не должно быть пустым")
    private String nameType;
    @NotNull(message = "Поле не должно быть пустым")
    @Size(min=4, max = 7, message = "Поле не должно быть пустым")
    private String shortName;
    boolean editable;

    public TypePicture(){}

    public TypePicture(String nameType, String shortName){
        this.nameType = nameType;
        this.shortName = shortName;
    }

    public void setNameType(String nameType){this.nameType = nameType;}
    public void setShortName(String shortName){this.shortName = shortName;}
    public void setEditable(boolean editable){this.editable = editable;}

    public String getNameType(){return nameType;}
    public String getShortName(){return shortName;}
    public boolean getEditable(){return editable;}
}
