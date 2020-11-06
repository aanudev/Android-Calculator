package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements OperationInterface{
    /** Field to store fraction and quotient
     */
    private int div, rem;
    /** Field to store if a division is legal
     */
    public boolean possible;

    /** Constructor to calculate fraction and quotient of parameters
     * @param arg1
     * @param arg2
     */
    public Divide(int arg1, int arg2) {
        // Check for zero division
        if (arg2!=0) {
            // Check if denominator has negative number
            if (arg2 < 0)
                arg1 *= -1;
            div = arg1 / arg2;
            rem = arg1 % arg2;
            possible = true;
        }
    }

    /** Overridden toString method to return fraction and quotient as string
     */
    @Override
    public String toString() {
        return possible? div+" R "+rem: "Cannot Divide by 0";
    }
}
