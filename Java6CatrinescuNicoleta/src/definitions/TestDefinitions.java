/*Definitions of geometric figures
 */
package definitions;

/**Class TestDefinitions - is the main class of definitions
 *
 * @author Amastasia
 */

public class TestDefinitions {
        public static void main(String[] args) {
            
        // Instances of Solution classes
        Solution solution = new Solution();
        
        // The required solution, with LinkedList 
        System.out.println(""); 
        System.out.println("The following method will test the LinkedList solution, presented in Solution class."); 
        System.out.println("I can show you the definitions for circle, triangle, square and/or rectangle. Please enter figures, in lowercase, separated by spaces. (Ex: circle circle rectangle)"); 
        solution.userList(); 
        solution.printDefinitions(); 

    }
    
}
