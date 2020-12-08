package JavaInterviewPractice.Scope;

public class Counter {
    int count = 0;

    public void incrementCount(int amount) {
        //parameters only live inside the associative functions
        this.count += amount;
    }


}
