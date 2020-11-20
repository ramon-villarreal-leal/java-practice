package JavaDataStructures;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {


        //Vectors are not in wide use Most people use ArrayLists
        String[] platform1 = {"Ps4"};
        String[] platform2 = {"3DS", "Wii U"};

        VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Dark Souls", 2009, "M", platform1);

        //no datatype specified
        Vector videoGames = new Vector();

       videoGames.add(game1);
       videoGames.add(game2);
    }

}
