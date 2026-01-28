package assigment7;

import java.util.Scanner;

public class exercise2_assignment7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String a = key.nextLine().trim();
        String[] tu = a.split("\\s+");
        System.out.println(tu.length);
    }
}
