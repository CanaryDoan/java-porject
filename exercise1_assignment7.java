package String;

import java.util.Scanner;

public class exercise1_assignment7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("nhap mang ");
        String a = key.nextLine();
        int dem = 0;
        System.out.println(a);
        for (int i = 0; i < a.length(); i++) {
            dem++;
        }
        System.out.println("dem " + dem);
    }
}
