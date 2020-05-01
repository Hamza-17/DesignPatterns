/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author dell
 */
public class DrinksFactory {
    
    Drinks getDrink(String DrinkType){         //a function that returns the specific drink object that is passed 
      if(DrinkType == null){                   //in the string
         return null;
      }		
      if(DrinkType.equalsIgnoreCase("AppleJuice")){
         return new AppleJuice();
         
      } else if(DrinkType.equalsIgnoreCase("CocaCola")){
         return new CocaCola();
         
      } else if(DrinkType.equalsIgnoreCase("OrangeJuice")){
            return new OrangeJuice();
      }
      
      else if(DrinkType.equalsIgnoreCase("Sprite")){
      return new Sprite();
      }
      
      
      return null;
   }

   
}
    

