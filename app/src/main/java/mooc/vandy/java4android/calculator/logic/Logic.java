package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    /** private, static, final fields for storing values
     * of operations (addition, multiplication, subtraction, division)
      */
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        /** Instantiate as Operation Interface
         */
        OperationInterface o;
        if (operation==ADDITION) {
        /** initialize new add object
         */
            o = new Add(argumentOne, argumentTwo);
        } else if (operation==SUBTRACTION) {
        /** initialize new subtract object
         */
            o = new Subtract(argumentOne, argumentTwo);
        } else if (operation==MULTIPLICATION) {
        /** initialize new multiplication object
         */
            o = new Multiply(argumentOne, argumentTwo);
        } else if (operation==DIVISION) {
        /** initialize new division object
         */
            o = new Divide(argumentOne, argumentTwo);
        } else {
        /**initialize new add object with empty constructor
         * to handle case of invalid operator
         */
            o = new Add();
        }
        /** Print out result
         */
        mOut.print(o.toString());
    }
}
