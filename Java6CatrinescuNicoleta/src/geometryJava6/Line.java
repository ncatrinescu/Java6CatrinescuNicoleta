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
public class Line extends Flat implements Defineable {
    
    String definition = "determinata de doua puncte ";

    @Override
    public String getDefinition() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        String parentDefinition = super.definition;
        String granpaDefinition = super.getParentDefinion();
        String finalDefinition = granpaDefinition + parentDefinition + definition;
        
        return finalDefinition;
    }
}
