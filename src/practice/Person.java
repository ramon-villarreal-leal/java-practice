package practice;

public class Person {


        public String firstName;
        public String lastName;

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }



    public static void main(String[] args) {
        Person bill = new Person();
        bill.firstName = "Bill";
        bill.lastName = "Newman";

        Person hopper = new Person();
        hopper.firstName = "Hopper";
        hopper.lastName = "Eli";

        Person laura = new Person();
        laura.firstName = "Laura";
        laura.lastName = "Leal";

        System.out.println(bill.sayHello());
        System.out.println(hopper.sayHello());
        System.out.println(laura.sayHello());
    }
}
