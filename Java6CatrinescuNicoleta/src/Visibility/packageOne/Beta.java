/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility.packageOne;

/**
 *
 * @author Amastasia
 */
public class Beta extends Alpha {
   private int privateVarB = 110;
    protected int protectedVarB = 120;
    int packageVarB = 130;
    public int publicVarB = 140;
    
public void testInternVariables(){
    System.out.println ("Visibility of private var:" + privateVarB);
    System.out.println ("Visibility of protected var:" + protectedVarB);
    System.out.println ("Visibility of package var:" + packageVarB);
    System.out.println ("Visibility of public var:" + publicVarB);
}
public void testInheritedVariables(){
    //System.out.println ("Visibility of private var:" + privateVaRa;
    System.out.println ("Visibility of protected var:" + protectedVaRa);
    System.out.println ("Visibility of package var:" + packageVaRa);
    System.out.println ("Visibility of public var:" + publicVaRa);
}
}

 
