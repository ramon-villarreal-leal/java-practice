package JavaInterviewPractice;

public class Practice {
    // Java Virtual Machine (JVM)
    // describes a set of instructions, registers, stack, heap, and method area
    // after compilation its called byte code
    // No jvm implmentation is the same
    // a class like Dog has instance variables like German Shepherd or Shih Tzu that represents instances of the Dog breed\//

    //static and non static method
    //Static
    // Belongs to class itself
    // Do not need an instance in order to use a static method
    //Method depends on class

    //static methods are way to go to use a method without creating an instance of the class bark()
    // static methods can only access class variables

    //non static method
    // instance method : accessing somnething specific of object
    // belongs to each object generated from the class
    // need an instance to use
    // Method depends on individual characteristics of object

    //when to use non static methods
    //can access non static and static variables
    // if your method is related to an objects attributes, it should be non static

    // 4 pillars of OOP
    // Abstraction
    // Encapsulation
    // Inheritance
    // Polymorphism

    // String literals String a = "abc";
    //String Object String A = new String("abc");
    //Strings are immutable in Java

    //Classes like StringBuilder and StringBuffer allow you to make String objects that are mutable

    //StringBuffer is thread safe and Strings are stored as Byte arrays instead of Char arrays
}
