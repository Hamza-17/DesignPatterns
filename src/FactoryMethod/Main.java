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
public class Main {
     public static void main(String[] args) {
      DrinksFactory drinkF = new DrinksFactory(); 

     Drinks d1=drinkF.getDrink("AppleJuice");  
      d1.Prepare();

     Drinks d2=drinkF.getDrink("OrangeJuice");
      d2.Prepare();
                                                //drinks are being prepared at runtime as the string with drink name
      Drinks d3=drinkF.getDrink("CocaCola");    //is passed and then it returns drink object through getDrink
      d3.Prepare();

                                                //the prepare of each specific object prints prepaing of
      Drinks d4=drinkF.getDrink("Sprite");      //that specific drink
      d4.Prepare();

      
   }
}
