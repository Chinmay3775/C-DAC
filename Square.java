class Calculate{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    double calArea(){
        double area;
        area=side*side;
        return area;
    }
    double calPerimeter(){
        double perimeter;
        perimeter=2*side;
        return perimeter;
    }    
}
public class Square {
    
    public static void main(String[] args) {
        Calculate obj=new Calculate();
        obj.setSide(5);
        System.out.println("Side: "+obj.getSide());
        System.out.println("Perimeter: "+obj.calPerimeter());
        System.out.println("Area: "+obj.calArea());
    }
}
