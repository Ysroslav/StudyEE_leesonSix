package com.gallerycrm.entities.dao;

import com.gallerycrm.entities.Log;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class LogDAO extends AbstractDAO {

    public void start() {
        manager.persist(new Log("APP STARTED"));
    }

    public void stopped() {
        manager.persist(new Log("APP STOPPED"));
    }

    public void testRollbackRTE() {
        manager.persist(new Log("testRollbackRTE"));
        throw new RuntimeException("testRollbackRTE");
    }

    public void testRollbackCatchRTE() {
        manager.persist(new Log("testRollbackCatchRTE"));
        try {
            throw new RuntimeException("testRollbackCatchRTE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
