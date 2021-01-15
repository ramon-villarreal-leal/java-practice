package practice;

public class Person {


        public String firstName;
        public String lastName;

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }



    public static void main(String[] args) {
        Person ada = new Person();
        ada.firstName = "Bill";
        ada.lastName = "Newman";

        Person grace = new Person();
        grace.firstName = "Hopper";
        grace.lastName = "Eli";

        System.out.println(ada.sayHello());
        System.out.println(grace.sayHello());
    }
}
