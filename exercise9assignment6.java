
import java.util.ArrayList;

public class exercise9 {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(5);
        n.add(7);
        n.add(1);
        n.add(4);
        System.out.println(n);
        for (int i = 0; i < n.size(); i++) {
            int min = n.get(0);
            int max = n.size();
            if (min > n.get(i)) {
                min = n.get(i);
                System.out.println("nho nhat " + min);
            } else if (max < n.get(i)) {
                max = n.get(i);
                System.out.println("lon nhat " + max);
            }
        }
    }
}
