package com.gallerycrm.entities.dao;

import com.gallerycrm.entities.Picture;
import com.gallerycrm.entities.Sale;
import com.sun.istack.internal.Nullable;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class SaleDAO extends AbstractDAO {

    @NotNull
    public List<Sale> getListSale(){
        return manager.createQuery("SELECT e " +
                "FROM tbl_sale e ORDER BY e.date_input", Sale.class).getResultList();
    }

    @NotNull
    public List<Sale> getListSaleByPictureId(@Nullable final String pictureId){
        if(pictureId ==null || pictureId.isEmpty()) return Collections.emptyList();
        return manager.createQuery("SELECT e FROM tbl_sale e " +
                "WHERE e.picture_id = :pictureId ORDER BY e.date_input", Sale.class).getResultList();
    }

    @Nullable
    public Sale getSaleById(@Nullable final String saleId){
        if(saleId ==null || saleId.isEmpty()) return null;
        return getEntity(manager.createQuery("SELECT e FROM tbl_sale e WHERE e.id = :id", Sale.class).setParameter("id", saleId));
    }

    @Nullable
    public Sale persist(@Nullable final Sale sale){
        if(sale == null) return null;
        manager.persist(sale);
        return sale;
    }

    @Nullable
    public Sale merge(@Nullable final Sale sale){
        if(sale == null) return null;
        return manager.merge(sale);
    }

    public void removeSaleById(@Nullable final String saleId){
        if(saleId == null||saleId.isEmpty()) return;
        final Sale sale = getSaleById(saleId);
        manager.remove(sale);
    }

}
