
import java.util.ArrayList;
import java.util.Random;

public class exrecise12 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int random = rand.nextInt(100) + 1;
            System.out.print(random + " ");
            so.add(random);
        }
        System.out.println();
        int tong = 0;
        for (int i = 0; i < so.size(); i++) {
            tong += so.get(i);
        }
        System.out.println("tong " + tong);
    }
}
