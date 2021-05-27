
package lab.pkg11;


public class Rectangle implements Shape {

    private int length;
    private int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area() {
       return length * width;
    }

}
