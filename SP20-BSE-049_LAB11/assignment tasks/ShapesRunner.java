
package lab.pkg11;


public class ShapesRunner {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[5];
        shapes[0]=new Circle(4.8);
        shapes[1]=new Circle(8.9);
        shapes[2]=new Rectangle(2,52);
        shapes[3]=new Triangle(1,5);
        shapes[4]=new Triangle(1,3);
        
           double arr_area[] = CalculateArea.Arr_Area(shapes);
            for(double area: arr_area) {
                System.out.println(area);
            }
    }
    
}
