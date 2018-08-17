package com.gallerycrm.entities.handlers;

import com.gallerycrm.entities.event.AsyncEvent;
import com.gallerycrm.entities.event.SyncEvent;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class EventManager {
    @Inject
    private Event<AsyncEvent> asyncEvent;

    @Inject
    private Event<SyncEvent> syncEvent;

    public void sync() {
        syncEvent.fire(new SyncEvent());
    }

    public void async() {
        asyncEvent.fire(new AsyncEvent());
    }
}
