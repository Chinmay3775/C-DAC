import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List <String> list =new ArrayList<>();
        Collections.addAll(list, "Red","Blue","Green","Yellow","Orange");
        Collections.sort(list);
        System.out.println(list.toString());
        String s="Brown";
        list.set(2, s);
        System.out.println(list.toString());
    }
}
