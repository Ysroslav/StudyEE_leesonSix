package com.gallerycrm.entities;

/*
Я использовал свой тестовый проект, который я писал для галерии. Класс Picture - класс картин
Sale - продажи, TypePicture - типы картин, для каждого класса я написал свой бин (CDI: PictureBean,
SaleBean, TypePicture соответсвенно) и потестировал один управляющий бин (PictureList);
для каждого бина создал файл xhtml, ( PictureBen - index.xhtml,SaleBean - sales.xhtml, TypePicture - types.xhtml)
в них я сделал таблицу, для отображения информации и кнопки для изменения, удаления, вставки. Данные
для таблиц я просто генерировал в конструкторах классах, так не много запутался с интеграцией базы данных
 */

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

@Named
@SessionScoped

public class Picture implements Serializable {
    private int id;
    @NotNull(message = "Поле не должно быть пустым")
    private String title;
    private Date dateInput;
    @NotNull(message = "Поле не должно быть пустым")
    private double valueBalance;
    private int idAuthor;
    @NotNull(message = "Поле не должно быть пустым")
    @Size(min=4, max = 7, message = "Поле не должно быть пустым")
    private String apostel;
    private int idType;
    boolean editable;

    public Picture(){}
    public Picture(String title, String apostel, double valueBalance){
        this.title = title;
        this.valueBalance = valueBalance;
        this.apostel = apostel;
    }

    public void setId(int id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setDateInput(Date dateInput){this.dateInput = dateInput;}
    public void setValueBalance(double valueBalance){this.valueBalance = valueBalance;}
    public void setIdAuthor(int idAuthor){this.idAuthor = idAuthor;}
    public void setApostel(String apostel){this.apostel = apostel;}
    public void setIdType(int idType){this.idType = idType;}
    public void setEditable(boolean editable){this.editable = editable;}

    public int getId(){return id;}
    public String getTitle(){return title;}
    public Date getDateInput(){return dateInput;}
    public double getValueBalance(){return valueBalance;}
    public int getIdAuthor(){return idAuthor;}
    public String getApostel(){return apostel;}
    public int getIdType(){return idType;}
    public boolean getEditable(){return editable;}
}
