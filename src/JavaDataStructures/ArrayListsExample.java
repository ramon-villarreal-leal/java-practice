package JavaDataStructures;

public class ArrayListsExample {
    public static void main(String[] args) {
        //Array list are not thread safe
        //Initial soze can be set when created and trimTo() method can reduce the size
        String [] platform1 = {"Ps4"};
        String [] platform2 = {"3DS", "Wii U"};

        VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
    }
}
