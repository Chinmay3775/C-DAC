class Calculate{
    static double pi=3.14;
    private double radius;

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double calArea( )
        {
            double area;
            area=pi*(radius*radius);
            return area;    
        }
        public double calCircum(){
            double circumference;
            circumference=2*pi*radius;
            return circumference;
        }
    }

public class Area_circumference {
    public static void main(String[] args) {
    
            Calculate obj =new Calculate();
            obj.setRadius(2);
            System.out.println("Radius: "+obj.getRadius());
            System.out.println("Area: "+obj.calArea());
            System.out.println("Circumference: "+obj.calCircum());
        }
    }
