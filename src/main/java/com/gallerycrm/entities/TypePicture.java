package com.gallerycrm.entities;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "TypePicture")

public class TypePicture implements Serializable, DBObjects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "type_name", length = 255, nullable = false, updatable = true)
    private String nameType;
    @Column(name = "short_name", length = 100, nullable = false, updatable = true)
    private String shortName;
    boolean editable;

    public TypePicture(){}


    public void setId(Long id){this.id = id;}
    public void setNameType(String nameType){this.nameType = nameType;}
    public void setShortName(String shortName){this.shortName = shortName;}
    public void setEditable(boolean editable){this.editable = editable;}


    public Long getId(){return id;}
    public String getNameType(){return nameType;}
    public String getShortName(){return shortName;}
    public boolean getEditable(){return editable;}
}
