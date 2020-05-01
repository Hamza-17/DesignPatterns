/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author dell
 */

//there is only one oven in the kitchen for the cook to use hence there can only be a single instance of it

public class MicrowaveOven {
    
    
    private static MicrowaveOven instance = new MicrowaveOven();

   //making the constructor private so that this class cannot be instantiated
   
   private MicrowaveOven(){}

   //returning the instance of the object
   public static MicrowaveOven getInstance(){  
      return instance;
   }

   public void showMessage(){
      System.out.println("Oven in use");
   }
    
}
