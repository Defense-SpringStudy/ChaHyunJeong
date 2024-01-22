package oop1;

public class RectangleProceduralMain {

    public static void main(String[] args) {

        //꼭 인스턴스 만들어줘야함!!
        RectangleData rectangleData = new RectangleData();

        //인스턴스.메서드!!!
        int area = rectangleData.calculateArea();
        int perimeter = rectangleData.calculatePerimeter();

        boolean square = rectangleData.isSquare();

        System.out.println("넓이: " + area);
        System.out.println("둘레 길이: " + perimeter);
        System.out.println("정사각형 여부: " + square);
    }



}