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
public class DemoMain {
    
    
     public static void main(String[] args) {


      //Get the only object available
      MicrowaveOven object = MicrowaveOven.getInstance();

      //showing that the oven is in use
      object.showMessage();
   }
    
}
