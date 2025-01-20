import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        double d1=0.0;
        double d2=0.0;
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        if(sc.hasNextDouble()&&!sc.hasNextInt()){
            d1=sc.nextDouble();
        }
        
        else {
            System.out.println("D1 is not a Double Number");
        }
        if(sc1.hasNextDouble()&&!sc1.hasNextInt()){
            d2=sc1.nextDouble();
        }
        else{
            System.out.println("D2 is not a Double Number");
        }
    
        Double Average=(d1+d2)/2;
        System.out.println("Average:" + Average);
        sc.close();
        sc1.close();
    }
}
