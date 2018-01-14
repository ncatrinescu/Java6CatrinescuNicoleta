/*
 *Try to synchronize two threads
  */
package multithreading;

/**
 *
 * @author Amastasia
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create counter object
        Counter contor = new Counter();
        //creste 2 thtreads
        Adunare add = new Adunare (contor);
        Scadere dif = new Scadere (contor);
        //start the threads
        add.start();
        dif.start();
    }
    
}
