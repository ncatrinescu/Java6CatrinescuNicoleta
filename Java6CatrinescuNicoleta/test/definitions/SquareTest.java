/*Plane figures definitions_Tests
 */

package definitions;

import org.junit.Test;
import static org.junit.Assert.*;


/**Class SquareTest - the class testing Square class
 *
 * @author Amastasia
 */

public class SquareTest {
    public SquareTest() {
}

/**
 * Test of getDefinition method, of class Square.
 */
@Test

public void testGetDefinition() {
    System.out.println("getDefinition");
    Square instance = new Square();
    String expResult = "SQUARE: a plane figure with four equal straight sides and four right angles.";
    String result = instance.getDefinition();
    assertEquals(expResult, result);
}
}
