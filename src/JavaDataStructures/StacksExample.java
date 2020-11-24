package JavaDataStructures;

import java.util.Stack;

public class StacksExample {
    //Stack uses Last In First out order
    //Vertical stack of objects
    // to add an item use .push() to stack
    // remove at end of item use .pop()
    // peek method makes a copy of the first item

    //A stack is an easy way to reverse a collection of values
    public static void main(String[] args) {
        //fori tab For loop shortcut
        Stack stack = new Stack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while(!stack.empty())
        {
            System.out.println(stack.pop());
            System.out.println(",");
        }
        System.out.println("LIFT OFF");
    }
}
