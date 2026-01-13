package lec5loop;

import java.util.*;
import java.util.Scanner;

public class exercise6 {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        Random rand = new Random();
        int m = rand.nextInt(100) + 1;
        int n;
        do {
            System.out.print("nhap n(1-100): ");
            n = keyboardScanner.nextInt();
            if (n < m) {
                System.out.println("lon hon");
            } else if (m < n) {
                System.out.println("be hon");
            } else {
                System.out.println("chuc mung");
            }
        } while (n != m);
    }
}
