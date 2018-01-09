package nyc.c4q.design_pattern_inclass.question2;

/**
 * Created by yokilam on 1/7/18.
 */

public class Underwear {
    private static Underwear underweaInstance;

    private String color;
    private String material;
    private String size;

    private Underwear() {
    }

    private Underwear(String color) {
        this.color = color;
    }

    private Underwear(String color, String material) {
        this.color = color;
        this.material = material;
    }

    private Underwear(String color, String material, String size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public static Underwear getUnderweaInstance(){
        if (underweaInstance!= null){
            return underweaInstance;
        }
        return new Underwear();
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
