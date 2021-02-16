package masterClass.ControlStatementsPractice;
// Positive Negative CH
public class Positive {

    int positive;

        public static void checkPositive(int number) {
            if(number > 0) {
                System.out.println("This number is positive");
            } else if(number < 0) {
                System.out.println("Number is negative");
            } else if(number == 0) {
                System.out.println("Numver is equal to 0");
            } else {
                System.out.println(number + " is neither");
            }
        }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }
}
