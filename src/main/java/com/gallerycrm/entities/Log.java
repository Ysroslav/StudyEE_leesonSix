package com.gallerycrm.entities;

import javax.persistence.Column;

public class Log  {
    @Column
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Log() {
    }

    public Log(String message) {
        this.message = message;
    }
}
