package JavaDataStructures;

import java.util.ArrayList;

public class CollectionsPlayground {
    // We'll start by defining an array list and adding some items to it
    public static void main(String[] args) {


        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");


        roasts.contains("dark"); // true
        roasts.contains("espresso"); // false


        roasts.lastIndexOf("medium"); // 2


        roasts.isEmpty(); // false
        ArrayList<String> emptyList = new ArrayList<>();
        emptyList.isEmpty(); // true


        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
        System.out.println(roasts); // [light, medium, dark]

        roasts.remove(2); // "dark"
        System.out.println(roasts); // [light, medium]
    }
}
