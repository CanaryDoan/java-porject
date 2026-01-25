package assg6;

import java.util.ArrayList;

public class exercise4 {

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Da Nang");
        city.add("Lon Don");
        city.add("Nha Trang");
        city.add("Da Lat");
        city.add("Ho Chi Minh");
        String a = "Lon Don";//tu khoa muon tim
        boolean tim = false;//chua tim thay nen false
        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).equals(a)) {//xem tp tai vtri i co giong a khong
                tim = true;//neu co thi doi thanh true
                break;
            }
        }
        if (tim) {
            System.out.println("danh sach co chua " + a);
        } else {
            System.out.println("danh sach khong chua " + a);
        }
    }
}
