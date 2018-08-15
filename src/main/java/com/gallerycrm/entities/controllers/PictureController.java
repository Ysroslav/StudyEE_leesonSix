package com.gallerycrm.entities.controllers;


import com.gallerycrm.entities.Picture;
import com.gallerycrm.entities.dao.PictureDAO;
import com.gallerycrm.entities.dao.SaleDAO;
import com.gallerycrm.entities.dao.TypePictureDAO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
@ManagedBean
public class PictureController {

    @Inject
    private PictureDAO pictureDAO;

    @Nullable
    private String id;

    @Nullable
    private String typeId;

    @NotNull
    private Picture picture = new Picture();

    public void init(){
        @Nullable
        final Picture picture = new Picture();
        if(picture!=null) this.picture = picture;
    }

    @NotNull
    public String save(){
        pictureDAO.merge(picture);
        return "picture-list";
    }



    @NotNull
    public Picture getPicture(){return picture;}

    public Picture getPictureById(){return pictureDAO.getPictureById(id);}

    public void setPicture(@Nullable Picture picture){
        this.picture = picture;
    }

    @Nullable
    public String getId(){return id;}

    public void setId(@Nullable final String id){this.id = id;}

    public String getTypeId(){return typeId;}
    public void setTypeId(String typeId){this.typeId = typeId;}


}
