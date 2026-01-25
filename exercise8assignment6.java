
import java.util.ArrayList;

public class exercise8 {

    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("duahau");
        c.add("cam");
        c.add("quyt");
        c.add("xoai");
        c.add("dautay");
        System.out.println(c);
        ArrayList<String> a = new ArrayList<>(c);//c trong ngoac la de sao chep
        System.out.println(a + " ");
    }
}
