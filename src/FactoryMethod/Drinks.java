/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;



//we are using this factory methods for the drink shop so that the required drinks can be produced at runtime
// by giving the order hence we dont need to form objects of each type of drinks class
/**
 *
 * @author dell
 */
public interface Drinks {  
    void Prepare(); //this method will be overridden in all specific drinks classes
    
}
