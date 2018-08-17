package com.gallerycrm.entities.handlers;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "dict_typepicture", schema = "gallery")
public class DictTypepictureEntity {
    private int id;
    private String nameType;
    private String shortName;
    private Date dateLoad;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_type", nullable = false, length = 255)
    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Basic
    @Column(name = "short_name", nullable = false, length = 255)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "date_load", nullable = false)
    public Date getDateLoad() {
        return dateLoad;
    }

    public void setDateLoad(Date dateLoad) {
        this.dateLoad = dateLoad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictTypepictureEntity that = (DictTypepictureEntity) o;
        return id == that.id &&
                Objects.equals(nameType, that.nameType) &&
                Objects.equals(shortName, that.shortName) &&
                Objects.equals(dateLoad, that.dateLoad);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nameType, shortName, dateLoad);
    }
}
