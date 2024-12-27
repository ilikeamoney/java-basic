package oop1;

public class Rectangle {
    int width;
    int height;

    int calculatorArea() {
        return width * height;
    }

    int calculatorPerimeter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }
}
