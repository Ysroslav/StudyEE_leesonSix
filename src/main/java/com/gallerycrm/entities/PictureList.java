package com.gallerycrm.entities;

import com.gallerycrm.entities.handlers.DBHandlers;
import com.gallerycrm.entities.mapper.PictureMapper;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


//@ManagedBean(name = "list", eager = true)
//@RequestScoped
public class PictureList implements Serializable {

    private List<Picture> pictures;
    private Connection connection;
    private DBHandlers db;

    public PictureList(){
        pictures = new ArrayList<Picture>();
        //выводим все картины
        /*db = new DBHandlers();
        try {
            Class.forName("org.sqlite.JDBC");
        }catch(ClassNotFoundException e){e.printStackTrace();}
        try{
            connection = DriverManager.getConnection(db.getConStr());
        } catch(SQLException e) {
            e.printStackTrace();
        }
        PictureMapper mapper = new PictureMapper(connection);*/

        for(int i = 0; i<5; i++) {
            Picture picture = new Picture("Picture" +(i+1), "XZ10" + i, 200+i*10);
            pictures.add(picture);
        }

    }

    public List<Picture> getPictures(){return pictures;}
    public void setPictures(List<Picture> pictures){this.pictures = pictures;}
}
