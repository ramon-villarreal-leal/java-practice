package JavaDataStructures;

import java.util.ArrayList;

public class ArrayListsExample {

    public static void main(String[] args) {
        //Array list are not thread safe
        //Initial soze can be set when created and trimTo() method can reduce the size
        String [] platform1 = {"Ps4"};
        String [] platform2 = {"3DS", "Wii U"};

        VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Dark Souls", 2009, "M", platform1);
        VideoGame game3 = new VideoGame("Pikmin 3", 2012, "E", platform2);

        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);




    }
}
