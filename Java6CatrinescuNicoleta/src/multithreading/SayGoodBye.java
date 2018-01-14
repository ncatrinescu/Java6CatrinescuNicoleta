/*
 * Display Say Hello in console
 */
package multithreading;

/**
 *
 * @author Amastasia
 */
public class SayGoodBye extends Thread{
    
    @Override
public void run() {
System.out.println("Good bye!");
}
}
