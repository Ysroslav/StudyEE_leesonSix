package com.gallerycrm.entities;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Message {
    private String msg = "Hello world";
    private String type = "succes";
    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }
}
