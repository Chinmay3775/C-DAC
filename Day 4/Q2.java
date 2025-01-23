import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List <String> list =new ArrayList<>();
        Collections.addAll(list, "Red","Blue","Green","Yellow","Orange");
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
