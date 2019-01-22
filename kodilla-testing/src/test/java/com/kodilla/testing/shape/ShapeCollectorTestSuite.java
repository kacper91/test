package com.kodilla.testing.shape;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollectorTestSuite {

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
        shapeCollection.remove(1);
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
