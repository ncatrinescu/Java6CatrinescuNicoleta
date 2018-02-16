/*
 * Plane figures definitions
 */
package definitions;

/**Class Figure - the super class of all figures
 *
 * @author Amastasia
 */

// Figure class, parent of Circle, Triangle, Square, Rectangle
public class Figure {
    
    // String constant to hold the common part for all figures definitions
    private static final String DEFINITION = "a plane figure ";
    
    // Method returning DEFINITION    
    public String getDefinition(){
            return DEFINITION;
    } 
}
