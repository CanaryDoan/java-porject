package assg6;

import java.util.ArrayList;
import java.util.Random;

public class exrecise5 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            so.add(rand.nextInt(100 - 1 + 1) + 1);
        }
        System.out.println(so);
        if (so.size() > 3) {
            int xoa = so.remove(3);
            System.out.println("da xoa " + xoa);
        }
        System.out.println(so);
    }
}
