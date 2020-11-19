package JavaDataStructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        //a ccess to elements is linear
        //pointer is at the top of the list
        //bidirectional list
        //ListIterator travels backwards through the list

        //LinkedList is good if you are going to be adding elements to the middle or end of list
        // adding anf retrieving is the same thing
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Colorado");
        states.add("California");
        states.add("Washington");
        states.add("New York");
        states.add("New Hampshire");
        //Last item of LinkedList points to null to indicate end of the list
        states.add("Connecticut");
        states.addFirst("Alabama");
        System.out.println("Last state in my list: " + states.getLast());
        // allows to change size of linkedlist
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        if(states.contains("California")) {
            System.out.println("Its a sunny state");
        }
    }
}
