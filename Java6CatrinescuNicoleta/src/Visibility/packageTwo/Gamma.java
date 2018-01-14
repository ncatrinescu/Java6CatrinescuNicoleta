/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visibility.packageTwo;

import Visibility.packageOne.Alpha;

/**
 *
 * @author Amastasia
 */
public class Gamma extends Alpha {
    private int privateVarG = 210;
    protected int protectedVaRG = 220;
    int packageVaRG = 230;
    public int publicVaRG = 240;
    
public void testInheritedVariables(){
    //System.out.println ("Visibility of private var:" + privateVarA);
    System.out.println ("Visibility of protected var:" + protectedVaRa);
    //System.out.println ("Visibility of package var:" + packageVaRa);
    System.out.println ("Visibility of public var:" + publicVaRa);
}
}
