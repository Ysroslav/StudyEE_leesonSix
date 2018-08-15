package com.gallerycrm.entities.controllers;

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

public class SaleListController {

    @Nullable
    private String pictureId;

    @Inject
    private SaleDAO saleDAO;

    @NotNull
    public List<Sale> getListSale(){
        if(pictureId==null || pictureId.isEmpty()) return saleDAO.getListSale();
        return saleDAO.getListSaleByPictureId(pictureId);
    }

    public void removeSaleById(@Nullable final String saleId){
        saleDAO.removeSaleById(saleId);
    }

    @Nullable
    public String getPictureId(){return pictureId;}

    public void setPictureId(@Nullable final String pictureId){this.pictureId = pictureId;}
}
