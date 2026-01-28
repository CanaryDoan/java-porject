package assigment7;

import java.util.Scanner;

public class exercise4_assignment7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("nhap mang ");
        String a = key.nextLine();
        String xoa = a.trim().replaceAll("\\s+", "");
        //replaceAll("\\s+", ""): thay thế cụm nhiều khoảng trắng thành 1 khoảng trắng
        System.out.println(xoa);
    }
}
