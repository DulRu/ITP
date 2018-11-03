/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

/**
 *
 * @author Dharshika
 */
public class ProductsModel {
    private String procode;
    private String procategory;
    private String prosubcategory;
    private String size;
    private String color;
    private String prounitmeasure;
    private double procostunit;
    
    
    
    
    public ProductsModel(String Procode, String Procategory, String Prosubcategory, String Size, String Color, String Prounitmeasure, double Procostunit)
    {
        this.procode=Procode;
        this.procategory=Procategory;
        this.prosubcategory=Prosubcategory;
        this.size=Size;
        this.color=Color;
        this.prounitmeasure=Prounitmeasure;
        this.procostunit=Procostunit;
    
    }
    
    public String getProcode() {
        return procode;
    }

    
    public void setProcode(String code) {
        this.procode = code;
    }

    public String getProcategory() {
        return procategory;
    }

    public void setProCategory(String procategory) {
        this.procategory = procategory;
    }
     public String getProsubcategory() {
        return prosubcategory;
    }

    public void setProsubcategory(String prosubcategory) {
        this.prosubcategory = prosubcategory;
    }
     public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
 public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
 public String getProunitmeasure() {
        return prounitmeasure;
    }

    public void setProunitmeasure(String procategory) {
        this.prounitmeasure = prounitmeasure;
    }

 public double getProcostunit() {
        return procostunit;
    }

    
    public void setProcostunit(double procostunit) {
        this.procostunit = procostunit;
    }

    
    
    
}

