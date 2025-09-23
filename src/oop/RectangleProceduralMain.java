package oop;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        ractangle.initData(5,8);


        int area = ractangle.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = ractangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = ractangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }


}
