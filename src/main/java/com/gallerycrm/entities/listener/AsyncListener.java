package com.gallerycrm.entities.listener;

import com.gallerycrm.entities.event.AsyncEvent;

import javax.ejb.Asynchronous;
import javax.enterprise.event.Observes;
import java.util.logging.Logger;

public class AsyncListener {

    private static final Logger LOGGER = Logger.getLogger(AsyncListener.class.getSimpleName());

    @Asynchronous
    public void observe(@Observes final AsyncEvent event) {
        LOGGER.info("[ASYNC] OBSERVE TREAD ID: "+Thread.currentThread().getId());
    }
}
