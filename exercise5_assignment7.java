package String;

import java.util.Scanner;

public class exercise5_assignment7 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("nhsp msng");
        String a = key.nextLine();
        int dem = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                dem++;
            }
        }
        System.out.println("dem " + dem);
    }
}
