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

// I have used this builder pattern for this burger creation as it has multiple ingredients to select from to
// make a burger object, as we want multiple options to select in order to make a burger hence the builder pattern
// helps a lot with it and provides more readibility to the code

public class Burger {

    
    private String type;          
    private boolean veggies;         //Different options to select from while making a burger
    private boolean cheese;          
    private boolean doublePatty;
    private boolean Fries; 
    private String sauce;
    
    
    
    private Burger(BurgerMaker b){     //constructor receives an object of burgermaker with all the selected options
    this.type=b.type;
    this.veggies=b.veggies;
    this.cheese=b.cheese;
    this.doublePatty=b.doublePatty;
    this.Fries=b.Fries;
    this.sauce=b.sauce;
     //   System.err.println("BurgerConstructor called");
    
    
    }
    
 void   print(){              //simple print function to print out all of the details of the burger
 
     System.out.println(type + " : ");
     if(veggies==true){
     System.out.print( "veggies, ");
     }
 
    if(cheese==true){
     System.out.print( "cheese, ");
     }
 
 
    if(doublePatty==true){
     System.out.print( "doublePatty, ");
     }
    
    if(Fries==true){
     System.out.println( " plus Fries ");
     }
    
     System.out.println(sauce + " sauce");
 
 }
    
    
    
    
    
    
    
    public static class BurgerMaker{  //static inner class
    private String type;
    private boolean veggies;
    private boolean cheese;
    private boolean doublePatty;   //same options for burger selection as in the outer class 
    private boolean Fries; 
    private String sauce;
    
    
    public BurgerMaker(String t){
    type=t;
    
    }
    
    public BurgerMaker veggies(Boolean v){
    veggies=v;
    return this;
    }
    
                                                     //Setting the options and returning object
    public BurgerMaker cheese(Boolean c){
    cheese=c;
    return this;
    }
    
    
    public BurgerMaker doublePatty(Boolean dP){
    doublePatty=dP;
    return this;
    }
    
    public Burger build(){
    return new Burger(this);  //returning the burger with all the selected options
    
    }
            
            
    public BurgerMaker fries(Boolean f){
   Fries=f;
    return this;                                
    }
    
    
    public BurgerMaker sauce(String s){
   sauce=s;
    return this;
    }
    
    }
    
    
    
    
  
}
