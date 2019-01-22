package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Shape> shapeCollection = new ArrayList<>();

        Circle circleOne = new Circle("nameForNewCircle",30.5);
        ShapeCollector newShape = new ShapeCollector(circleOne);
        newShape.addFigure(circleOne);
        System.out.println(shapeCollection.size());

    }
}
