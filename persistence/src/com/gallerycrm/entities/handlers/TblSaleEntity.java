package com.gallerycrm.entities.handlers;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tbl_sale", schema = "gallery")
public class TblSaleEntity {
    private int id;
    private int pictureId;
    private int clientId;
    private double prize;
    private Date dateSale;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "picture_id", nullable = false)
    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Basic
    @Column(name = "client_id", nullable = false)
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "prize", nullable = false, precision = 0)
    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Basic
    @Column(name = "date_sale", nullable = false)
    public Date getDateSale() {
        return dateSale;
    }

    public void setDateSale(Date dateSale) {
        this.dateSale = dateSale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblSaleEntity that = (TblSaleEntity) o;
        return id == that.id &&
                pictureId == that.pictureId &&
                clientId == that.clientId &&
                Double.compare(that.prize, prize) == 0 &&
                Objects.equals(dateSale, that.dateSale);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, pictureId, clientId, prize, dateSale);
    }
}
