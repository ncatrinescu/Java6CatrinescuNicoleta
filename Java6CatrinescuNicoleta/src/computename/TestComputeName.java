/*
 Compute your full name initials from and displays them
 */
package computename;

/**
 *
 * @author Amastasia
 */
public class TestComputeName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String myName = "Nicoleta Catrinescu";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + myInitials);
    }
}

