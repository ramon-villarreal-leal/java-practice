package practice;

public class Person {


        public String firstName;
        public String lastName;

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }



    public static void main(String[] args) {
        Person ada = new Person();
        ada.firstName = "Ada";
        ada.lastName = "Lovelace";

        Person grace = new Person();
        grace.firstName = "Grace";
        grace.lastName = "Hopper";

        System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
        System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"
    }
}
