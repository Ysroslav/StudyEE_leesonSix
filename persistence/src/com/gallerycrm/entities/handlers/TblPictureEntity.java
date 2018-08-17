package com.gallerycrm.entities.handlers;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_picture", schema = "gallery")
public class TblPictureEntity {
    private int id;
    private String titlePicture;
    private Date dateInput;
    private double valueBalance;
    private String apostel;
    private int athorId;
    private int pictureType;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title_picture", nullable = false, length = 255)
    public String getTitlePicture() {
        return titlePicture;
    }

    public void setTitlePicture(String titlePicture) {
        this.titlePicture = titlePicture;
    }

    @Basic
    @Column(name = "date_input", nullable = false)
    public Date getDateInput() {
        return dateInput;
    }

    public void setDateInput(Date dateInput) {
        this.dateInput = dateInput;
    }

    @Basic
    @Column(name = "value_balance", nullable = false, precision = 0)
    public double getValueBalance() {
        return valueBalance;
    }

    public void setValueBalance(double valueBalance) {
        this.valueBalance = valueBalance;
    }

    @Basic
    @Column(name = "apostel", nullable = false, length = 255)
    public String getApostel() {
        return apostel;
    }

    public void setApostel(String apostel) {
        this.apostel = apostel;
    }

    @Basic
    @Column(name = "athor_id", nullable = false)
    public int getAthorId() {
        return athorId;
    }

    public void setAthorId(int athorId) {
        this.athorId = athorId;
    }

    @Basic
    @Column(name = "picture_type", nullable = false)
    public int getPictureType() {
        return pictureType;
    }

    public void setPictureType(int pictureType) {
        this.pictureType = pictureType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblPictureEntity that = (TblPictureEntity) o;
        return id == that.id &&
                Double.compare(that.valueBalance, valueBalance) == 0 &&
                athorId == that.athorId &&
                pictureType == that.pictureType &&
                Objects.equals(titlePicture, that.titlePicture) &&
                Objects.equals(dateInput, that.dateInput) &&
                Objects.equals(apostel, that.apostel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, titlePicture, dateInput, valueBalance, apostel, athorId, pictureType);
    }
}
