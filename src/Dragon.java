import javafx.scene.shape.MoveTo;

import java.util.Random;

public class Dragon {
    private static int getRandom(int min, int max) {

        if (min>max){
            throw new IllegalArgumentException (" Max must be greater than min");
        }
        Random getRandom = new Random ();
        return getRandom.nextInt ((max - min)+ min);



    }
    int MoveDirection = getRandom (0, 60);



}
