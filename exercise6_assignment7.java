package assigment7;

import java.util.Scanner;

public class exercise6_assignment7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String goc = key.nextLine();
        System.out.println("nhap tu can thay ");
        String tuThay = key.nextLine();
        System.out.println("nhap tu moi ");
        String tuMoi = key.nextLine();
        String moi = goc.replace(tuThay, tuMoi);
        //replace: giúp thay thế "tuThay" thành "tuMoi"
        System.out.println(moi);
    }
}
