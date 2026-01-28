package String;

import java.util.Scanner;

public class exercise3_assignment7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("nhap mang ");
        String a = key.nextLine();
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }
}
