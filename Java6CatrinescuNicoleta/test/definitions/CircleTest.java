/*Plane figures definitions_Tests
 */

package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class CircleTest - the class testing Circle class
 *
 * @author Amastasia
 */

public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * Test of getDefinition method, of class Circle.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Circle instance = new Circle();
        String expResult = "CIRCLE: a plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}


