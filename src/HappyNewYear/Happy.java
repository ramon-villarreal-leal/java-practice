package HappyNewYear;

public class Happy {
    private String happy;
    private String happyDay;

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    public String getHappyDay() {
        return happyDay;
    }

    public void setHappyDay(String happyDay) {
        this.happyDay = happyDay;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i > 0) {
                System.out.println("Today will be a good day");
            }
        }
    }
}
