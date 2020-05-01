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
public class CocaCola implements Drinks{
    
    
    @Override
    public void Prepare() {
        System.out.println("Preparing CocaCola");
    }
    
}
