/*
 * Family Scene
 */
package family;

/**
 *
 * @author Amastasia
 */
public class FamilyScene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tcreste instances of all actors
        Cigar tigara = new Cigar();
        Women femeie = new Women(tigara);
        Tv televizor = new Tv();
        VacuumCleaner aspirator = new VacuumCleaner();
        Man barbat = new Man(aspirator, femeie, televizor);
        
        //Star the threads
        tigara.start();
        televizor.start();
        aspirator.start();
        femeie.start();
        barbat.start();
        
        
    }
    
}
