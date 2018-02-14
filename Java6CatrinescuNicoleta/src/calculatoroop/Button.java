/*
**Class Button - buttons of calculator.
 */
package calculatoroop;

/**
 *
 * @author Amastasia
 */
public class Button {
   
    public Character pushButton() {
        return markup;
    }

    public void drawOnButton(Character markup) {
        this.markup = markup;
    }

    private Character markup;
}
