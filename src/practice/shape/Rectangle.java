package practice.shape;

public class Rectangle implements Shape{

    private static int width;
    private static int height;
    @Override
    public double area() {
        return width*height;
    }
}
