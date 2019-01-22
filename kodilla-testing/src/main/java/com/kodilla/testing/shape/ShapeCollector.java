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
        System.out.println("add: " + shapeCollection.size());
    }

    public void removeFigure(Shape shape) {
        shapeCollection.remove(shape);
        System.out.println("remove: " + shapeCollection.size());
    }

    public void getFigure(int n) {

        System.out.println(shapeCollection.get(n).getShapeName() + " " + shapeCollection.get(n).getField());
    }

    public void showFigures() {
        for (Shape allFigures : shapeCollection) {
            System.out.println("all figures: " + allFigures.getShapeName()+ " " + allFigures.getField());

        }
    }
}
