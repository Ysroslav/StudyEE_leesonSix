package com.gallerycrm.entities.dao;

import com.gallerycrm.entities.Sale;
import com.gallerycrm.entities.TypePicture;
import com.sun.istack.internal.Nullable;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class TypePictureDAO extends AbstractDAO {

    @NotNull
    public List<TypePicture> getListPicture(){
        return manager.createQuery("SELECT e " +
                "FROM tbl_style e ORDER BY e.date_input", TypePicture.class).getResultList();
    }



    @Nullable
    public TypePicture getPictureById(@Nullable final String typeId){
        if(typeId ==null || typeId.isEmpty()) return null;
        return getEntity(manager.createQuery("SELECT e FROM tbl_style e WHERE e.id = :id", TypePicture.class).setParameter("id", typeId));
    }

    @Nullable
    public TypePicture persist(@Nullable final TypePicture type){
        if(type == null) return null;
        manager.persist(type);
        return type;
    }

    @Nullable
    public TypePicture merge(@Nullable final TypePicture type){
        if(type == null) return null;
        return manager.merge(type);
    }

    public void removeTaskById(@Nullable final String typeId){
        if(typeId == null||typeId.isEmpty()) return;
        final TypePicture type = getPictureById(typeId);
        manager.remove(type);
    }

}
