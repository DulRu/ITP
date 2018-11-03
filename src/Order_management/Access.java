/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order_management;

/**
 *
 * @author Ganador
 */
public class Access {
    
       private String fName;
      private  String lName;
      private  String Add1;
      private  String Add2;
      private  String City;
      private  String State;
     private   String Zip;
     private   String Country;
     private   String Company;
      private  String Phone ;
      private  String Email;
     private   String Fax ;
    
     public Access(String FName,String LName,String add1,String add2,String city,String state,String zip,String country,String company,String phone,String email,String fax ){
         this.fName=FName;
         this.lName=LName;
         this.Add1=add1;
         this.Add2=add2;
         this.City=city;
         this.State=state;
         this.Zip=zip;
         this.Country=country;
         this.Company=company;
         this.Phone=phone;
         this.Email=email;
         this.Fax=fax;
     }
     
     public String getFName(){
         return fName;
     }
     public void setFName(String Fname){
         this.fName=Fname;
     }
     public String getLName(){
         return lName;
     }
     public void setLName(String Lname){
         this.lName=Lname;
     }
     public String getAdd1(){
         return Add1;
     }
     public void setAdd1(String add1){
         this.Add1=add1;
     }
      public String getAdd2(){
         return Add2;
     }
     public void setAdd2(String City){
         this.Add2=City;
     }
      public String getCity(){
         return City;
     }
     public void setCity(String City){
         this.City=City;
     }
       public String getState(){
         return State;
     }
     public void setState(String State){
         this.State=State;
     }
     public String getZip(){
         return Zip;
     }
     public void setZip(String Zip){
         this.Zip=Zip;
     }
      public String getCountry(){
         return Country;
     }
     public void setCountry(String Country){
         this.Country=Country;
     }
     public String getCompany(){
         return Company;
     }
     public void setCompany(String Company){
         this.Company=Company;
     }
     public String getPhone(){
         return Phone;
     }
     public void setPhone(String Phone){
         this.Phone=Phone;
     }
     public String getEmail(){
         return Email;
     }
     public void setEmail(String Email){
         this.Email=Email;
     }
     public String getFax(){
         return Fax;
     }
     public void setFax(String Fax){
         this.Fax=Fax;
     }
}
