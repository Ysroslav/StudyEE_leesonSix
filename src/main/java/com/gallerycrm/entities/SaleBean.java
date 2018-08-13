package com.gallerycrm.entities;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped

public class SaleBean implements Serializable {
    @Inject
    @Model
    private Sale sales;
    private List<Sale> list;

    public SaleBean(){
        list = new ArrayList<Sale>();
        for(int i = 0; i<3; i++) {
            Sale sale = new Sale(new Picture(), (i+1)*100, "Manager"+i);
            sale.getPicture().setTitle("Picture" + i);
            list.add(sale);
        }
    }

    public List<Sale> getList(){
        return list;
    }

    public void setList(List<Sale> list){this.list = list;}

    public void setSales(Sale sales) {
        this.sales = sales;
    }



    public String editAction(Sale s){
        s.setEditable(true);
        return null;
    }
    public String saveAction(){
        for(Sale s : list){
            s.setEditable(false);
        }
        return null;
    }

    public String deleteAction(Sale s){
        list.remove(s);
        return null;
    }

    public String addAction(){
        Picture p = new Picture();
        p.setTitle("New Picture");
        list.add(new Sale(p, 0, "Somebody"));
        return null;
    }
}
