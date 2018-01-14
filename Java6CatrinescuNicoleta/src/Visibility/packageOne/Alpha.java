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
public class Alpha {
    private int privateVarA = 10;
    protected int protectedVaRa = 20;
    int packageVaRa = 30;
    public int publicVaRa = 40;
    
public void testInternVariables(){
    System.out.println ("Visibility of private var:" + privateVarA);
    System.out.println ("Visibility of protected var:" + protectedVaRa);
    System.out.println ("Visibility of package var:" + packageVaRa);
    System.out.println ("Visibility of public var:" + publicVaRa);
}
}
