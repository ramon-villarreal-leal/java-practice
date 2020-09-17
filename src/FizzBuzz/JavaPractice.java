package FizzBuzz;

public class JavaPractice {


    public static void main(String[] args) {
        // Practice FizzBuzz in Java

        for(int i =0; i <= 100; i +=1) {
            if(i % 3 ==0 && i % 5 ==0) {
                System.out.println("fizzBuzz");
            } else if(i % 5 ==0) {
                System.out.println("Fizz");
            } else if(i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        //basic for loop
        for(int i =0; i<=10; i++) {
            System.out.println(i);
        }


    }


}
