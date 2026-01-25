package assg6;

import java.util.ArrayList;

public class exercise2 {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("red");
        color.add("pink");
        color.add("green");
        color.add("black");
        color.add("white");
        System.out.println(color);
        color.set(1, "yellow");
        System.out.println(color);
    }
}
