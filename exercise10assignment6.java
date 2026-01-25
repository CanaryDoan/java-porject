
import java.util.ArrayList;

public class exercise10 {

    public static void main(String[] args) {
        ArrayList<String> ten = new ArrayList<>();
        ten.add("yen");
        ten.add("binh");
        ten.add("yen");
        ten.add("han");
        ten.add("binh");
        ten.add("thang");
        System.out.println(ten);
        ArrayList<String> ten2 = new ArrayList<>();
        for (String teen : ten) {//lay tung ten trong ten gan vao teen
            if (!ten2.contains(teen)) {//ktra xem ten2 co chua ten do khong(
                ten2.add(teen);
            }
        }
        System.out.println(ten2);
    }
}
