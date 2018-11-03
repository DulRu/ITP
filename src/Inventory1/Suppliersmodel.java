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
public class Suppliersmodel {
    
    private int supplierid;
    private String businessname;
    private String contactname;
    private String country;
    private String address;
    private String phone;
    private String email;
    private String website;
    private String itemcategory;
    private String itemsubcategory;
    
    private String accountno;
   
    private String notes;
    
    public Suppliersmodel(int Supplierid,
     String Businessname,
     String Contactname,
     String Country,
     String Address,
     String Phone,
     String Email,
     String Website,
     String Itemcategory,
     String Itemsubcategory,
    
     String Accountno,
     
     String Notes
    )
     {
            
         
     this.supplierid=Supplierid;
     this.businessname=Businessname;
     this.contactname=Contactname;
     this. country=Country;
     this. address=Address;
     this. phone=Phone;
     this. email=Email;
     this. website=Website;
     this. itemcategory=Itemcategory;
     this. itemsubcategory=Itemsubcategory;
     
     this. accountno=Accountno;
    
     this. notes=Notes;
    
    
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
     * @return the contactname
     */
    public String getContactname() {
        return contactname;
    }

    /**
     * @param contactname the contactname to set
     */
    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return the itemcategory
     */
    public String getItemcategory() {
        return itemcategory;
    }

    /**
     * @param itemcategory the itemcategory to set
     */
    public void setItemcategory(String itemcategory) {
        this.itemcategory = itemcategory;
    }

    /**
     * @return the itemsubcategory
     */
    public String getItemsubcategory() {
        return itemsubcategory;
    }

    /**
     * @param itemsubcategory the itemsubcategory to set
     */
    public void setItemsubcategory(String itemsubcategory) {
        this.itemsubcategory = itemsubcategory;
    }

    /**
     * @return the itemname
     */
 

    /**
     * @return the accountno
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * @param accountno the accountno to set
     */
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    /**
     * @return the currency
     */
  
    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
}
