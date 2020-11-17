package JavaDataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        //a ccess to elements is linear
        //pointer is at the top of the list
        //bidirectional list
        //ListIterator travels backwards through the list
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Colorado");
        //Last item of LinkedList points to null to indicate end of the list
        states.add("Connecticut");
        states.addFirst("Alabama");
        System.out.println("Last state in my list: " + states.getLast());
        // allows to change size of linkedlist
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious());
        System.out.println(iterator.previous());
    }
}
