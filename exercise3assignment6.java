package assg6;

import java.util.ArrayList;

public class exercise3 {

    public static void main(String[] args) {
        ArrayList<Double> price = new ArrayList<>();
        price.add(3.9);
        price.add(2.0);
        price.add(6.8);
        price.add(7.9);
        for (int i = 0; i < price.size(); i++) {
            System.out.println(price.get(i));
        }
    }
}
