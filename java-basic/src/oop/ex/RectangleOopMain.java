package oop.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.width = 5;
        rec.height = 8;

        System.out.println("넓이 : "+rec.calculateArea());
        System.out.println("둘레 길이 : "+rec.calculatePerimeter());
        System.out.println("정사각형 여부 : " + rec.isSquare());
    }
}
