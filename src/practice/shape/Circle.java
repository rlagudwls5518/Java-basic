package practice.shape;

public class Circle implements Shape {

    private static int range;
    private static final double PI = 3.14;

    @Override
    public double area() {

        return range*range*PI;
    }
}
