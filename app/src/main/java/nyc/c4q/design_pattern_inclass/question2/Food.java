package nyc.c4q.design_pattern_inclass.question2;

/**
 * Created by yokilam on 1/7/18.
 */

public class Food {
    private static Food foodInstance;

    private Food(){

    }

    public static Food getInstance(){
        if (foodInstance != null) {
            return foodInstance;
        }
        foodInstance= new Food();
        return foodInstance;
    }
}
