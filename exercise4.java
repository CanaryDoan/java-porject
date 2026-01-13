package lec5loop;

import java.util.*;
import java.util.Scanner;

public class exercise4 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("nhap n(1-100): ");
        double n = keyboard.nextDouble();
        double m = rand.nextDouble() * (100 - 1) + 1;
        System.out.println(m);
        if (n > m) {
            System.err.print(n + " lon hon " + m);
        } else if (n < m) {
            System.out.print(n + " nho hon " + m);
        } else {
            System.out.print("bang nhau");
        }
    }
}
