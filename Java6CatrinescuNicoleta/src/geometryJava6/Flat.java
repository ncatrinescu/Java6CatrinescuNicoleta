/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryJava6;

/**
 *
 * @author Amastasia
 */
public class Flat extends Shape {
    
    protected String definition = "plana ";
       
    protected String getParentDefinion(){
        String parentDefinition = super.definition;
        
        return parentDefinition;
    }
}
