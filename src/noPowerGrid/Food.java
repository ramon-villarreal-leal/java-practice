package noPowerGrid;

public class Food {
    private String shumai;
    private String water;
    private String craftBeer;

    public String getShumai() {
        return shumai;
    }

    public void setShumai(String shumai) {
        this.shumai = shumai;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getCraftBeer() {
        return craftBeer;
    }

    public void setCraftBeer(String craftBeer) {
        this.craftBeer = craftBeer;
    }

    public Food(String shumai, String water, String craftBeer) {
        this.shumai = shumai;
        this.water = water;
        this.craftBeer = craftBeer;
    }

    public static void main(String[] args) {

    }
}
