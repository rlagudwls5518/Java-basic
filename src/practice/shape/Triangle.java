package practice.shape;

public class Triangle implements Shape{

    private static int height;
    private static int floor;

    @Override
    public double area() {
        return (floor*height)/2;
    }
}
