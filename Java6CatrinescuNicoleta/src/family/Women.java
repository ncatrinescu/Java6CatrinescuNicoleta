/*
 * Women character
 */
package family;

/**
 *
 * @author Amastasia
 */
public class Women extends Thread {
    private Boolean isSleepeng = true;
    private Cigar tigara;

    public void setIsSleepeng(Boolean isSleepeng) {
        this.isSleepeng = isSleepeng;
        
    }
    public Women(Cigar c){
        tigara = c;
    }
    @Override
   public void run() {
       System.out.println("Women is slepeeng ... and snoring");
       while(isSleepeng){
}
   System.out.println("Women is looking the TV");
   }    
}

  

   