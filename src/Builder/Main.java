/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author dell
 */
public class Main {
    
      public static void main(String[] args) {

     
      Burger burger=new Burger.BurgerMaker("Grilled Beef").veggies(true).cheese(true).fries(true).doublePatty(true).sauce("mayo garlic").build();
      //selecting all the options while making a burger and as we can see it simplifies the creation of the burger.
     //easy to select multiple options while building the burger 
      burger.print();
      
      }
    
}
