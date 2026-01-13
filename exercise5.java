package lec5loop;

import java.util.*;
import java.util.Scanner;

public class exercise5 {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        Random rand = new Random();
        int m = rand.nextInt(10 - 1 + 1) + 1;
        System.out.println(m);
        int n;
        int dem = 0;
        do {
            System.out.print("nhap n(1-10): ");
            n = keyboardScanner.nextInt();
            dem++;
        } while (n != m);
        System.out.println("dung");
        System.out.println("dem " + dem);
    }
}
