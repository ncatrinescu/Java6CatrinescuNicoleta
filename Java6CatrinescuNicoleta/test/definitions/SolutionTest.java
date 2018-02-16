/*Plane figures definitions_Tests
 */

package definitions; 
 
import java.io.ByteArrayInputStream; 
import org.junit.Test; 
import static org.junit.Assert.*; 


/**Class SolutionTest - the class testing Solution class
 *
 * @author Amastasia
 */

public class SolutionTest {
    public SolutionTest() {
}

/**
 * * Test of userList method, of class Solution.
 */
@Test
public void testUserList() {
    System.out.println("userList test");
    Solution instance = new Solution();
    ByteArrayInputStream in = new ByteArrayInputStream("triangle".getBytes());
    System.setIn(in);
    int expectedResult = instance.userList();
    assertEquals(1,expectedResult);
}

 /**
  * Test of printDefinitions method, of class Solution.
  */
@Test
public void testPrintDefinitions() {
    System.out.println("printDefinitions test");
    Solution instance = new Solution();
    ByteArrayInputStream in = new ByteArrayInputStream("square".getBytes());
    System.setIn(in);
    instance.userList();
    String expectedResult = "SQUARE: a plane figure with four equal straight sides and four right angles.";
    String result = instance.printDefinitions();
    assertEquals(result, expectedResult);
}
}