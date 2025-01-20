class Complex{
    int real;
    int img;
    public int getReal() {
        return real;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
    public void init(int real,int img){
        System.out.print(real+"+"+img+"i");
    }

}
public class Main {
    public static void main(String[] args) {
        Complex obj=new Complex();
        obj.setReal(5);
        obj.setImg(3);
        System.out.print("Complex Number: ");
        obj.init(obj.getReal(), obj.getImg());
    }
}
