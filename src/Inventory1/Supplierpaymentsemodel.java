/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory1;

import java.util.Date;

/**
 *
 * @author Dharshika
 */
public class Supplierpaymentsemodel {
    private int paymentid;
    private int purchaseorderno;
    private int supplierid;
    private String businessname;
    private String paymenttype;
    private Date paymentdate;
    private double totalamount;
    private double paidamount;
    private double dueamount;
    

  public Supplierpaymentsemodel(  int Paymentid, int Purchaseorderno, int Supplierid,String Businessname,String Paymenttype,Date Paymentdate,double Totalamount,double Paidamount,double Dueamount)
    {
        this.paymentid=Paymentid;
        this.purchaseorderno=Purchaseorderno;
        this.supplierid=Supplierid;
        this.businessname=Businessname;
        this.paymenttype=Paymenttype;
        this.paymentdate=Paymentdate;
        this.totalamount=Totalamount;
        this.paidamount=Paidamount;
        this.dueamount=Dueamount;
       

        
    }

    /**
     * @return the paymentid
     */
    public int getPaymentid() {
        return paymentid;
    }

    /**
     * @param paymentid the paymentid to set
     */
    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    /**
     * @return the purchaseorderno
     */
    public int getPurchaseorderno() {
        return purchaseorderno;
    }

    /**
     * @param purchaseorderno the purchaseorderno to set
     */
    public void setPurchaseorderno(int purchaseorderno) {
        this.purchaseorderno = purchaseorderno;
    }

    /**
     * @return the supplierid
     */
    public int getSupplierid() {
        return supplierid;
    }

    /**
     * @param supplierid the supplierid to set
     */
    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    /**
     * @return the businessname
     */
    public String getBusinessname() {
        return businessname;
    }

    /**
     * @param businessname the businessname to set
     */
    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    /**
     * @return the paymenttype
     */
    public String getPaymenttype() {
        return paymenttype;
    }

    /**
     * @param paymenttype the paymenttype to set
     */
    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    /**
     * @return the paymentdate
     */
    public Date getPaymentdate() {
        return paymentdate;
    }

    /**
     * @param paymentdate the paymentdate to set
     */
    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    /**
     * @return the totalamount
     */
    public double getTotalamount() {
        return totalamount;
    }

    /**
     * @param totalamount the totalamount to set
     */
    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * @return the paidamount
     */
    public double getPaidamount() {
        return paidamount;
    }

    /**
     * @param paidamount the paidamount to set
     */
    public void setPaidamount(double paidamount) {
        this.paidamount = paidamount;
    }

    /**
     * @return the dueamount
     */
    public double getDueamount() {
        return dueamount;
    }

    /**
     * @param dueamount the dueamount to set
     */
    public void setDueamount(double dueamount) {
        this.dueamount = dueamount;
    }

   
}