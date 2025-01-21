

import java.util.Scanner;
class Triangle{
    private double side1;
    private double side2;
    private double side3;
    public Triangle() {
        side1=0;
        side2=0;
        side3=0;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public void Accept(){
        Scanner sc= new Scanner(System.in);
    
        System.out.println("Enter the Length of Sides of Triangle");

        System.out.println("Side 1:");
        side1=sc.nextDouble();

        System.out.println("Side 2:");
        side2=sc.nextDouble();
        
        System.out.println("Side 3:");
        side3=sc.nextDouble();
    }
    public void Display(){
            System.out.println("Side 1: "+ side1);
            System.out.println("Side 2: "+ side2);
            System.out.println("Side 3: "+ side3);
    }
    public double calPeri(){
        return side1+side2+side3;
    } 
    public boolean isValid(){
        if(side1+side2>side3&&side1+side3>side2&&side2+side3>side1) {
            return true;
        }
        return false;
    }
}
public class Shape {
    public static void main(String[] args) {

        Triangle[] arr = new Triangle[4];

        for(int i=0;i<4;i++){
            arr[i]=new Triangle();
            arr[i].Accept();
        // }
        // for(int i=0;i<4;i++){
            System.out.println("Triangle "+(i+1)+":");
            arr[i].Display();
            if(arr[i].isValid()){
                double perimeters=arr[i].calPeri();
                System.out.println("Perimeter of Valid Triangle is: "+perimeters);
            }
            else{
                System.out.println("Triangle is Not Valid");
            }
        }

    }
}
