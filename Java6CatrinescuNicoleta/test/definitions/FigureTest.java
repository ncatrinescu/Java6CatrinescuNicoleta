/*Plane figures definitions_Tests
 */

package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**Class FigureTest - the class testing Figure class
 *
 * @author Amastasia
 */

public class FigureTest {
    
    public FigureTest() {
}

  /** 
   * Test of getDefinition method, of class Figure. 
   */ 
   @Test 
   public void testGetDefinition() { 
      System.out.println("getDefinition"); 
      Figure instance = new Figure(); 
      String expResult = "a plane figure "; 
      String result = instance.getDefinition(); 
      assertEquals(expResult, result); 
          
    } 
  } 
