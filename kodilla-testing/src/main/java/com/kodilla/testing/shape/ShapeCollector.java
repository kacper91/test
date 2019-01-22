package com.kodilla.testing.shape;

import java.util.*;

interface Shape {
    String getShapeName();
    double getField();
}

public class ShapeCollector {

    public ShapeCollector(Shape shape) {

    }

    List<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapeCollection.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
    }

    public void getFigure(int n) {
        shapeCollection.get(n);
    }

    public void showFigures() {
        for (Shape allFigures : shapeCollection) {
            System.out.println(allFigures);

        }
    }


}
