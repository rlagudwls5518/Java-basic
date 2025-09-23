package oop;

public class Ractangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        return width == height;
    }
    void initData(int width, int height){
        this.height= width;
        this.width = width;
    }

}

