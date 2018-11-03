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
public class validation {
    public static int isnum(String wrd){
       
          int a=1; 
        if(!wrd.isEmpty())
        {
            for(int x=0;x<wrd.length();x++)
            {
                if(!Character.isDigit(wrd.charAt(x)))
                {
                    
                    a=0;
                }
            }

        } 
       return a;
   }
      
   public static int checkemail(String Email1){
          int x=1;
               String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
               if((!Email1.matches(ePattern))&&(!Email1.isEmpty())){
                   x=0;
               }
               return x;
      }
   
   public static int isletters(String aa){
       
          int a=1; 
        if(!aa.isEmpty())
        {
            for(int x=0;x<aa.length();x++)
            {
                if(!Character.isLetter(aa.charAt(x)))
                {
                    
                    a=0;
                }
            }

        } 
       return a;
   }
}
