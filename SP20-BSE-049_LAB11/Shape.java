
package lab.pkg11;


public interface Shape {
    double Area();
    
}
class Circle implements Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double Area(){
         double area = 3.14*radius*radius;
         return area;
    }
    public void Display(){
        System.out.println("Area of circle is "+Area());
    }
    
}
class Rectangle implements Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double Area(){
        double area = (width*height);
        return area;
    }
     public void Display(){
        System.out.println("Area of rectanngle is "+Area());
    }

}
class Triangle implements Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double Area(){
        double area = (base*height)/2;
        return area;
    }
     public void Display(){
        System.out.println("Area of triangle is "+Area());
    }

}
/*class GeometricShape implements Shape{
    double radius;

    public GeometricShape(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
     public double Area(){
         double area = 2*3.14*radius;
         return area;
    }
    public void Display(){
        System.out.println("Area of the Geometric Shape is "+Area());
    }
}*/

