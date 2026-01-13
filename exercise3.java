package lec5loop;

import java.util.*;

public class exercise3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(80 - 3 + 1) + 3;
        System.out.println(n);
        if (n % 2 == 0) {
            System.out.println("so chan");
        } else {
            System.out.println("so le");
        }
    }
}
