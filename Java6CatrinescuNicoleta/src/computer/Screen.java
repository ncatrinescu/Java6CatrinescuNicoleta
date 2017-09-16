package computer;


/**
 * Class Screen implements behaviour of screen
 * @author Amastasia
 */
public class Screen {
    
    String screenMemory = "Display: ";
    
    public void display(String deAfisat){
        screenMemory += deAfisat;
        System.out.println(screenMemory);
    }
}
