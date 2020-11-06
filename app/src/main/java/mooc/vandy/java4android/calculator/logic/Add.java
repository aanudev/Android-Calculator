package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface{
    /** Field to store addition
     */
    private int sum;
    /** Field to store if sum has been calculated
     */
    private boolean calcSum;

    /** Default Constructor Used to handle invalid operation
     */
    public Add(){
    }

    /** Constructor to calculate sum
     * @param arg1
     * @param arg2
     */
    public Add(int arg1, int arg2) {
        sum = arg1 + arg2;
        calcSum = true;
    }

    /** Overridden toString method to return sum as string if exists
     */
    @Override
    public String toString() {
        return calcSum? ""+sum: "Please provide a Valid Operation";
    }
}
