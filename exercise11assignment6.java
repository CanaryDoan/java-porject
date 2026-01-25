
import java.util.ArrayList;
import java.util.Random;

public class exercise11 {

    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            so.add(rand.nextInt(100) + 1);
            System.out.print(so.get(i) + " ");
        }
        System.out.println();
        int min = so.get(0);
        int max = so.get(0);
        for (int i = 0; i < so.size(); i++) {
            if (min > so.get(i)) {
                min = so.get(i);
            } else if (max < so.get(i)) {
                max = so.get(i);
            }
        }
        System.out.println("nho nhat " + min);
        System.out.println("lon nhat " + max);
    }
}
