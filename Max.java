import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        double n1;
        double n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N1");
        n1=sc.nextDouble();
        System.out.println("Enter N2");
        n2=sc.nextDouble();
        sc.close();
        double max=Math.max(n1, n2);
        System.out.println("Max: "+max);
    }
}
