/*
 * An application that launches three instances of Notepad 
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amastasia
 */
public class LaunchNotepads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
ProcessBuilder pb;
// Use process builder to launch 3 notepads 
    pb= new ProcessBuilder("notepad");
   
pb.directory(new File("C:\\Users\\Amastasia\\Desktop")) ;
Process p1 = pb.start();
Process p2 = pb.start();
Process p3 = pb.start();
} catch (IOException ex) {
Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
}
}
} 
