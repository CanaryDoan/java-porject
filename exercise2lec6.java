package lec6_array;

import java.util.Scanner;

public class exercise2 {

    public static int[] nhap(Scanner key) {
        System.out.println("nhap n: ");
        int n = key.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = key.nextInt();
        }
        return a;
    }

    public static void xuat(int[] a) {
        System.out.println("cac phan tu trong mang: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void dao(int[] a) {
        System.out.println("dao nguoc: ");
        for (int i = a.length - 1; i >= 0; i--) {//neu i la n thi se chay nguoc lai
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void soChan(int[] a) {
        System.out.println("cac so chan: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    public static void tongChiaHet(int[] a) {
        System.out.println("tong cac so chia het 3&5");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                sum += a[i];
            }
        }
        System.out.print(sum);
        System.out.println();
    }

    public static void tangDan(int[] a) {
        System.out.println("tang dan: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {//so nho dung trc, neu i>j nghia la bi ngc thu tu
                    int doi = a[i];//doi se luu giu gtri i trc khi bi ghi de
                    a[i] = a[j];//ghi gtri cua j vao i
                    a[j] = doi;//ghi gtri trong doi vao j
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void giamDan(int[] a) {
        System.out.println("giam dan: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {//so lon dung trc, neu i<j nghia la bi ngc thu tu
                    int doi = a[i];//doi se luu giu gtri i trc khi bi ghi de
                    a[i] = a[j];//ghi gtri cua j vao i
                    a[j] = doi;//ghi gtri trong doi vao j
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] a = nhap(key);
        xuat(a);
        dao(a);
        soChan(a);
        tongChiaHet(a);
        tangDan(a);
        giamDan(a);
    }
}
