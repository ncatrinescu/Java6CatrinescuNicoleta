/*
 * Simple calculator
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @amastasia
 */
public class SimpleCalculator {

       public static void main(String[] args) {
        System.out.println( "Please introduce your first number:"); 
                
         // Display in console "Please introduce your first number:". 
         double result = 0; 
                 
         try (Scanner scanner = new Scanner(System.in)){ 
          // Read first number from console.
          double x = scanner.nextDouble(); 
           
          System.out.println( "Please introduce operator(+/-/*//):"); 
          // Please introduce operator(+/-/*//)
          String operator = scanner.next(); 
           
          System.out.println( "Please introduce second number:"); 
         // Please introduce second number.
          double y = scanner.nextDouble(); 
           
          // This is a switch that will evalute the input operator. 
          switch (operator){ 
               
              case "+": 
                  result = x+y; 
                  break; 
              case "-": 
                  result = x-y; 
                  break; 
              case "*": 
                  result = x*y; 
                  break; 
              case "/": 
                  result = x/y; 
                  break; 
              // If user introduces something else instead of the 4 operators, error message appears 
              default:  
                  System.out.println("Sorry, you introduced wrong operator. I quit :)"); 
                  System.exit(0); 
          } 
          System.out.println( "Please introduce =:"); 
           
          String calcResult = scanner.next(); 
          
          if ("=".equals(calcResult)) { 
                    
          System.out.println( "Result is: " + result); 
           
         }  
          else 
           // If user introduces something else instead of =, error message appears    
          {System.out.println("Sorry, that wasn't =. I quit :)"); 
          System.exit(0); 
          } 
          
         } 
                  
         // If user introduces characters instead of numbers, error message appears 
         catch (Exception e) { 
             System.out.println("Sorry, you introduced wrong data. I quit :)"); 
       } 
     } 
   } 
