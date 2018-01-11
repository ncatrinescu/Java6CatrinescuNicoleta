package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Tv
 */

/**
 *
 * @author Amastasia
 */
public class Tv extends Thread{
   private Boolean isFavoriteShow = false;

    public Boolean getIsFavoriteShow() {
        return isFavoriteShow;
    }

        
    @Override
    public void run (){
        try
        {
            System.out.println("TV show are boring...");
            Thread.sleep(1000);
           
        }  
        catch (InterruptedException ex) {
           Logger.getLogger(Tv.class.getName()).log(Level.SEVERE, null, ex);
       }
    isFavoriteShow= true;
    }
    

    public void receiving (){
        while(true){
           
                
            
        }
    }
}