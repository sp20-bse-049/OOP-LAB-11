
package lab.pkg11;


public class Circle implements Shape {
    private double radius;
    
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    
}
