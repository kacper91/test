package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Circle;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {
    private static int counter = 0;

    @Test
    public void testAddFigure() {
        //Given
        List<Shape> shapeCollection = new ArrayList<>();
        Triangle triangleOne = new Triangle("trojkat",20);
        Square squareOne = new Square("kwadrat",40);
        Circle circleOne = new Circle("kolo", 50);

        shapeCollection.add(triangleOne);
        shapeCollection.add(squareOne);
        shapeCollection.add(circleOne);

        //When
        int result=shapeCollection.size();
        //Then
        Assert.assertEquals(result,3);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        List<Shape> shapeCollection = new ArrayList<>();
        Triangle triangleOne = new Triangle("trojkat",20);
        Square squareOne = new Square("kwadrat",40);
        Circle circleOne = new Circle("kolo", 50);
        shapeCollection.add(triangleOne);
        shapeCollection.add(squareOne);
        shapeCollection.add(circleOne);
        shapeCollection.add(triangleOne);
        shapeCollection.add(squareOne);
        shapeCollection.add(circleOne);
        //When
        shapeCollection.remove(triangleOne);
        int result = shapeCollection.size();
        //Then
        Assert.assertEquals(result,5);
    }

    @Test
    public void testGetFigure() {
        //Given
        List<Shape> shapeCollection = new ArrayList<>();
        Triangle triangleOne = new Triangle("trojkat",20);
        shapeCollection.add(triangleOne);

        //When
        //shapeCollection.get(0);
        //Then
        Assert.assertEquals(shapeCollection.get(0).getShapeName(),"trojkat");
    }

    @Test
    public void testShowFigures() {
        //Given
        List<Shape> shapeCollection = new ArrayList<>();
        Triangle triangleOne = new Triangle("trojkat",20);
        shapeCollection.add(triangleOne);
        //When
        String name=  shapeCollection.get(0).getShapeName();
        double field = shapeCollection.get(0).getField();
        //Then
        Assert.assertEquals((name + " " + field), "trojkat 20.0");
    }

}
