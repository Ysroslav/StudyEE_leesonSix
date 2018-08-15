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


@ViewScoped
@ManagedBean

public class SaleController {


    @Inject
    private SaleDAO saleDAO;
    @Inject
    private PictureDAO pictureDAO;

    @Nullable
    private String id;

    @Nullable
    private String pictureId;

    @NotNull
    private Sale sale = new Sale();

    public void init(){
        @Nullable
        final Sale sale = new Sale();
        if(sale!=null) this.sale = sale;
    }

    @NotNull
    public String save(){
        if(pictureId!=null) sale.setPictureId(pictureDAO.getPictureById(pictureId).getId());
        saleDAO.merge(sale);
        return "sale-list";
    }

    @NotNull
    public Sale getSale(){return sale;}

    public void setSale(@Nullable Sale sale){
        this.sale = sale;
    }

    @Nullable
    public String getId(){return id;}

    public void setId(@Nullable final String id){this.id = id;}
    public String getPictureId(){return pictureId;}
    public void setPictureId(String pictureId){this.pictureId = pictureId;}



}
