package masterClass;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        //example of an overflow
        System.out.println("Busted Max value is = " + (myMaxIntValue + 1));
        //example of underflow it flips to opposite
        System.out.println("Busted Min value is = " + (myMinIntValue -1));
        // use appropriate numbers and data  types

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Maximum Value = " + myMaxByteValue );
        System.out.println("Byte Minimum Value = " +myMinByteValue );

    }
}
