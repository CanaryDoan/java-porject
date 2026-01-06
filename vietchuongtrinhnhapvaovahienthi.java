package exercise1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class vietchuongtrinhnhapvaovahienthi {

    public static void main(String argsString[]) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Fullname: ");
        String hoTen = keyboard.nextLine();
        System.out.print("Student ID: ");
        int mSSV = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Hometown: ");
        String diaChi = keyboard.nextLine();
        System.out.print("GPA: ");
        float gpa = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.print("Mayjor: ");
        String mayjor = keyboard.nextLine();
        System.out.print("Scholarship: ");
        boolean hocBong = keyboard.nextBoolean();
        keyboard.nextLine();
        System.out.print("Ngay thang nam sinh: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date birth = sdf.parse(keyboard.nextLine());
        System.out.println("Ho va ten: " + hoTen + "\nStudentID: " + mSSV + "\nHometown: " + diaChi + "\nGPA: " + gpa + "\nMayjor: " + mayjor + "\nScholarship: " + (hocBong ? "co hoc bong" : "khong co hoc bong") + "\nNgay thang nam sinh: " + sdf.format(birth));
    }
}
