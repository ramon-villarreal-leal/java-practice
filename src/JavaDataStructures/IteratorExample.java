package JavaDataStructures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("Red", "Orange", "Yellow", "Green","Blue", "Indigo", "Violet");
        //HAS METHODS OF NEXT, HASNEXT, AND REMOVE
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collection collection1 = Arrays.asList("Little Big Planet", "Grand Turismo", "DS");

        Iterator iterator1 = collection1.iterator();

    }

    //Iterator is useful for using ArrayList, LinkedList, Queues and Stacks
}
