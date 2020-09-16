package controlFlow;
import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {


        //grades java
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();


        //grades displaying:
        System.out.print("Would you like to enter a grade?");
        int userGradeInput = sc.nextInt();

        System.out.print("Continue to see your grade? [y/n]");
        String userAnswer = sc.next();
        boolean yesSeeGrades = userAnswer.equalsIgnoreCase("y");
        if (yesSeeGrades) {
            if (userGradeInput >= 95) {
                System.out.println("A+");
            } else if (userGradeInput >= 90) {
                System.out.println("A-");
            } else if (userGradeInput >= 85) {
                System.out.println("B+");
            } else if (userGradeInput >= 80) {
                System.out.println("B-");
            } else if (userGradeInput >= 75) {
                System.out.println("C+");
            } else if (userGradeInput >= 70) {
                System.out.println("C-");
            } else if (userGradeInput >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.printf("Your grade is: %s ", userGradeInput);

        } else {
            System.out.println("Looks like you won't see your grade.");
        }
    }
}
