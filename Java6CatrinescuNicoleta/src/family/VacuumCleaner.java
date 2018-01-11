/*
 * Vacuum Cleaner
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amastasia
 */

public class VacuumCleaner extends Thread {
 
    private Boolean isCleaning = false;
    public Boolean getIsCleaning() {

        return isCleaning;

    }

    public void setIsCleaning(Boolean isCleaning) {

        this.isCleaning = isCleaning;

    }
   

    @Override

    public void run(){}

      

    private void VacuumCleaner(){

    if (isCleaning){ 

        try {

            Thread.sleep(MIN_PRIORITY);

        } catch (InterruptedException ex) {

         Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);

        }

    

    }

    } 

}
