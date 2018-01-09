package nyc.c4q.design_pattern_inclass.question2;

/**
 * Created by yokilam on 1/7/18.
 */

public class Tools {
    private static Tools toolsInstance;

    private Tools(){

    }

    public static Tools getToolsInstance(){
        return new Tools();
    }
}
