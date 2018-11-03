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
public class BillofmaterialsModel {
    private int billno;
    private String procode;
    private String procategory;
    private String prosubcategory;
    private String size;
    private String color;
    private String fabname;
    private int fabcode;
   
    private String fabcolor;
    private double unitprodct;
    
    
     public BillofmaterialsModel(  int Billno,
    String Procode,
    String Procategory,
     String Prosubcategory,
     String Size,
   String Color,
     int Fabcode,
      String Fabname,
    
   
     String Fabcolor,
     double Unitprodct)
    {
                this.billno=Billno;
                this.procode=Procode;
                this.procategory=Procategory;
                this.prosubcategory=Prosubcategory;
               this.size=Size;
               this.color=Color;
               this.fabname=Fabname;
               this.fabcode=Fabcode;
               
               this.fabcolor=Fabcolor;
               this.unitprodct=Unitprodct;
    
    }

    /**
     * @return the billno
     */
    public int getBillno() {
        return billno;
    }

    /**
     * @param billno the billno to set
     */
    public void setBillno(int billno) {
        this.billno = billno;
    }

    /**
     * @return the procode
     */
    public String getProcode() {
        return procode;
    }

    /**
     * @param procode the procode to set
     */
    public void setProcode(String procode) {
        this.procode = procode;
    }

    /**
     * @return the procategory
     */
    public String getProcategory() {
        return procategory;
    }

    /**
     * @param procategory the procategory to set
     */
    public void setProcategory(String procategory) {
        this.procategory = procategory;
    }

    /**
     * @return the prosubcategory
     */
    public String getProsubcategory() {
        return prosubcategory;
    }

    /**
     * @param prosubcategory the prosubcategory to set
     */
    public void setProsubcategory(String prosubcategory) {
        this.prosubcategory = prosubcategory;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the fabname
     */
    public String getFabname() {
        return fabname;
    }

    /**
     * @param fabname the fabname to set
     */
    public void setFabname(String fabname) {
        this.fabname = fabname;
    }

    /**
     * @return the fabcode
     */
    public int getFabcode() {
        return fabcode;
    }

    /**
     * @param fabcode the fabcode to set
     */
    public void setFabcode(int fabcode) {
        this.fabcode = fabcode;
    }

    /**
     * @return the procostunit
     */
   
    /**
     * @param procostunit the procostunit to set
     */
    

    /**
     * @return the fabcolor
     */
    public String getFabcolor() {
        return fabcolor;
    }

    /**
     * @param fabcolor the fabcolor to set
     */
    public void setFabcolor(String fabcolor) {
        this.fabcolor = fabcolor;
    }

    /**
     * @return the unitprodct
     */
    public double getUnitprodct() {
        return unitprodct;
    }

    /**
     * @param unitprodct the unitprodct to set
     */
    public void setUnitprodct(double unitprodct) {
        this.unitprodct = unitprodct;
    }
    
    
    
    
}
