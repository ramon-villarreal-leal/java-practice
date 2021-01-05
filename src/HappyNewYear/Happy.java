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
        String[] happy = {"Jubilant", "Happy", "Ecstatic"};
        for (String i : happy) {
            System.out.println(i);
        }
    }
}
