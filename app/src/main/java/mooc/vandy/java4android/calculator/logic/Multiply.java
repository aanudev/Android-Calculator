package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements OperationInterface {
    /** Field to store multiplication result
     */
    private int mul;

    /** Constructor to calculate multiplication of parameters
     * @param arg1
     * @param arg2
     */
    public Multiply(int arg1, int arg2) {
        mul = arg1 * arg2;
    }

    /** Overridden toString method to return multiplication as string
     */
    @Override
    public String toString() {
        return ""+mul;
    }
}
