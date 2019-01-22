package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Shape> shapeCollection = new ArrayList<>();
        Triangle triangleOne = new Triangle("trojkat", 20);
        Square squareOne = new Square("kwadrat", 40);
        Circle circleOne = new Circle("kolo", 50);


       ShapeCollector.addFigure(triangleOne);


    }
}
