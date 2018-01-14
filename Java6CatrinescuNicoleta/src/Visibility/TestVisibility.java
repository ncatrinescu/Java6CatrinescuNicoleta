/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility;

import Visibility.packageOne.Alpha;
import Visibility.packageOne.Beta;

/**
 *
 * @author Amastasia
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Alpha alphaObject = new Alpha();
        Beta betaObject = new Beta ();
       
      //  System.out.println("testVisibility Alpha class: public var:");alphaObject.publicVaRa);  
     //System.out.println("testVisibility Alpha class: protected var:");alphaObject.protectedVaRa);
     //System.out.println("testVisibility Alpha class: package var:");alphaObject.packagreVaRa); 
     
     System.out.println("testVisibility Alpha class: public method:");
     alphaObject.testInternVariables(); 
     
     System.out.println("testVisibility Beta class: public method:");
     alphaObject.testInternVariables(); 
     
     
     
    }
    
}
