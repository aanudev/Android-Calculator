package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements OperationInterface{
    /** Field to store subtraction result
     */
    private int sub;

    /** Constructor to calculate difference between parameters
     * @param arg1
     * @param arg2
     */
    public Subtract(int arg1, int arg2) {
        sub = arg1 - arg2;
    }

    /** Overridden toString method to return subtraction as string
     */
    @Override
    public String toString() {
        return ""+sub;
    }
}
