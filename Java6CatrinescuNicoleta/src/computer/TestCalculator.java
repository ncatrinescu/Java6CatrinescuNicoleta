package computer;

/*
 * Tests Calculator
 */

/**
 * Class TestClaculator tests Calculator
 * @author Amastasia
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Calculator instace
        Calculator computer=new Calculator();
        //start the Calculator
        computer.start();
        //test the add of 123+223
        computer.add();
        //test 233-122
        computer.decrease();
        //test 123-12
        computer.multiply();
        //test24:6
        computer.divide();
    }
    
}
