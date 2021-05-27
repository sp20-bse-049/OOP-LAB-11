package lab.pkg11;

public class Triangle implements Shape {

    private int base;
    private int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
