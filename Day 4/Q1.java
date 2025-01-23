// import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
// import java.util.HashSet;
// import java.util.LinkedList;
// import java.util.List;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        
    
// List <String> c = new ArrayList();
// Collection<String> c = new LinkedList<>();
// Collection<String> c = new HashSet<>();
Collection<String> c = new TreeSet<>();

// c.add("A");
// c.add("B");
// c.add("C");
// c.add(null);
// c.add(null);
// c.add(null);
Collections.addAll(c,"A","B","C");
System.out.println(c.toString());



}
}