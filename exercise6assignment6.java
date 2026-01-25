package assg6;

import java.util.ArrayList;
import java.util.Random;

public class exercise6 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random rand = new Random();
        int demLe = 0;
        int demChan = 0;
        for (int i = 0; i < 15; i++) {
            so.add(rand.nextInt(50 - 1 + 1) + 1);
            if (so.get(i) % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }
        System.out.println(so);
        System.out.println("so chan " + demChan);
        System.out.println("so le " + demLe);
    }
}
