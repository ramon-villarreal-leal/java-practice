package JavaDataStructures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("Red", "Orange", "Yellow", "Green","Blue", "Indigo", "Violet");
        //HAS METHODS OF NEXT, HASNEXT, AND REMOVE
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Iterator is useful for using ArrayList, LinkedList, Queues and Stacks
}
