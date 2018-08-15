package com.gallerycrm.entities.controllers;

import com.gallerycrm.entities.Picture;
import com.gallerycrm.entities.Sale;
import com.gallerycrm.entities.dao.PictureDAO;
import com.gallerycrm.entities.dao.SaleDAO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
@ManagedBean

public class PictureListController {

    @Nullable
    private String typeId;

    @Inject
    private PictureDAO pictureDAO;

    @NotNull
    public List<Picture> getListPicture(){
        if(typeId==null || typeId.isEmpty()) return pictureDAO.getListPicture();
        return pictureDAO.getListPictureByTypeId(typeId);
    }

    public void removePictureById(@Nullable final String pictureId){
        pictureDAO.removePictureById(pictureId);
    }

    @Nullable
    public String getTypeId(){return typeId;}

    public void setTypeId(@Nullable final String typeId){this.typeId = typeId;}
}
