/*
 * 
 */
package multithreading;

/**
 *
 * @author Amastasia
 */
public class TestMTT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SayGoodMorning sgm = new SayGoodMorning ();
        SayGoodBye sgb = new SayGoodBye ();
        // see priorities
        sgm.setPriority(10);
        sgb.setPriority(1);
        //check status
         System.out.println (" SGM status is: " + sgm.getState());
         System.out.println (" SGB status is: " + sgb.getState());
        // start 2 thread
        sgm.start();
        sgb.start();
           //check status
         System.out.println (" SGM status is: " + sgm.getState());
         System.out.println (" SGB status is: " + sgb.getState());
        // see priorities
        System.out.println (" SGM priority is: " + sgm.getPriority());
        System.out.println (" SGB priority is: " + sgb.getPriority());
        
    }
    
}
