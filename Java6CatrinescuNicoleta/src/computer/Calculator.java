/*
 * TComputer frame
 */
package computer;

/**
 * Screen of computertor frame
 * @author Amastasia
 */
public class Calculator {
    
    private Screen ecran;

    public Calculator() {
        ecran=new Screen();
    }
    
    
    
    /**
     * Methods adds 2 digits introduced by the user from keyboard
     */    
    public void add(){
    
    }
   /** Methods substracts 2 digits introduced by the user
    */ 
    public void decrease(){
        
    }
    /**
     * Multiply two numbers introduced by the user
     */
    

    public void multiply(){
        
    }
    
    /**
     * Divide two numbers introduced by the user
     */
    
    public void divide(){
        
    }
    
    /**
     * Start the computer
     */
    
    public void start(){
        ecran.display("0");
    }
}