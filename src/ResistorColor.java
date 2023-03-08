import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;

public class ResistorColor {
    private String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    public int colorCode(String color){
        return Arrays.asList(colors).indexOf(color);
    }

    public String[] colors(){
        return colors;
    }
}
