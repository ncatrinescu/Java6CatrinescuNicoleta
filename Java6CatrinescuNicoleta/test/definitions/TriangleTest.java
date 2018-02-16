/*Plane figures definitions_Tests
 */


package definitions;

import org.junit.Test;
import static org.junit.Assert.*;


/**Class TriangleTest - the class testing Triangle class
 *
 * @author Amastasia
 */

public class TriangleTest {
    
    public TriangleTest() {
    }
    
/**
 * Test of getDefinition method, of class Triangle.
 */
@Test

public void testGetDefinition() {
    System.out.println("getDefinition");
    Triangle instance = new Triangle();
    String expResult = "TRIANGLE: a plane figure with three straight sides and three angles.";
    String result = instance.getDefinition();
    assertEquals(expResult, result);
}
}
