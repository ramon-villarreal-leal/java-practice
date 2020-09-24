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
        System.out.println("Busted Min value is = " + (myMinIntValue - 1));
        // use appropriate numbers and data  types

        int myMaxIntTest = 2147483647;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minimum Value = " + myMinByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);

        long bigLongLiteralValue;

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        // casting in Java
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("start of test!");
        byte aNumber = 10;
        short shortNumber = 20;
        int intNumber = 50;
        int sum = aNumber + shortNumber +intNumber;

        long longNumber = 50000L + 10L * (sum);
        System.out.println(longNumber);

    }


}
