package com.gallerycrm.entities.dao;

import javax.ejb.Stateful;


import com.gallerycrm.entities.Picture;
import com.sun.istack.internal.Nullable;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

@Stateful
public class PictureDAO extends AbstractDAO {

    @NotNull
    public List<Picture> getListPicture(){
        return manager.createQuery("SELECT e " +
                "FROM tbl_picture e ORDER BY e.date_input", Picture.class).getResultList();
    }

    @NotNull
    public List<Picture> getListPictureByTypeId(@Nullable final String typeId){
        if(typeId ==null || typeId.isEmpty()) return Collections.emptyList();
        return manager.createQuery("SELECT e FROM tbl_picture e " +
                "WHERE e.athor_id = :authorId ORDER BY e.date_input", Picture.class).getResultList();
    }

    @Nullable
    public Picture getPictureById(@Nullable final String pictureId){
        if(pictureId ==null || pictureId.isEmpty()) return null;
        return getEntity(manager.createQuery("SELECT e FROM tbl_picture e WHERE e.id = :id", Picture.class).setParameter("id", pictureId));
    }

    @Nullable
    public Picture persist(@Nullable final Picture picture){
        if(picture == null) return null;
        manager.persist(picture);
        return picture;
    }

    @Nullable
    public Picture merge(@Nullable final Picture picture){
        if(picture == null) return null;
        return manager.merge(picture);
    }

    public void removePictureById(@Nullable final String pictureId){
        if(pictureId == null||pictureId.isEmpty()) return;
        final Picture picture = getPictureById(pictureId);
        manager.remove(picture);
    }

}
