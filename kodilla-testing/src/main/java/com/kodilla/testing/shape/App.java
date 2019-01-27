package com.kodilla.testing.shape;

public class App {
    public static void main(String[] args) {

        Circle circleOne = new Circle("nameForNewCircle", 30.5);
        Triangle triangleOne = new Triangle("nameForNewTriangle", 40.5);
        Square squareOne = new Square("nameForNewSquare", 66);
        ShapeCollector newShape = new ShapeCollector();

        newShape.addFigure(circleOne);
        newShape.addFigure(triangleOne);
        newShape.addFigure(squareOne);
        newShape.removeFigure(circleOne);
        newShape.getFigure(0);
        newShape.showFigures();


    }
}
