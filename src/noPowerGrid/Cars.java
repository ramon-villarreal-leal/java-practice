package noPowerGrid;

public class Cars {
    private String engine;
    private String ac;
    private String wheels;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public Cars(String engine, String ac, String wheels) {
        this.engine = engine;
        this.ac = ac;
        this.wheels = wheels;
    }
}
