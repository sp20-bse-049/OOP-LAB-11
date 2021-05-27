package lab.pkg11;

public class CalculateArea {

    public static double[] Arr_Area(Shape[] shapes) {
        double[] ob = new double[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                ob[i] = shapes[i].area();
            }
        }
        return ob;
    }
}
