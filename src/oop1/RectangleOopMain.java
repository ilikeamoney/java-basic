package oop1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.width = 8;
        r.height = 8;

        int area = r.calculatorArea();
        System.out.println("넓이 = " + area);

        int perimeter = r.calculatorPerimeter();
        System.out.println("둘레 길이 = " + perimeter);

        boolean square = r.isSquare();
        System.out.println("정사각형 여부 = " + square);
    }
}
