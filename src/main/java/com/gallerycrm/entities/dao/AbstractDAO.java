package com.gallerycrm.entities.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class AbstractDAO {

    @NotNull
    public static final String PERSISTENCE_UNIT = "example-persistence-unit";

    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    protected EntityManager manager;

    @Nullable
    public <T> T getEntity(@NotNull final TypedQuery<T> query){
        final List<T> resultList = query.getResultList();
        if(resultList.isEmpty()) return null;
        return resultList.get(0);
    }
}
