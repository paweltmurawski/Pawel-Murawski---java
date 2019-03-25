package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
    //given
     ShapeCollector shapeCollector = new ShapeCollector();
     Shape circle = new Circle(3, 5);
     //when
         shapeCollector.addFigure(circle);
        //then
        Shape actualShape = shapeCollector.getFigure(0);
        Assert.assertEquals(75, actualShape.getField());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(3);
        shapeCollector.addFigure(square);
        //when
        shapeCollector.removeFigure(square);
        //then
        shapeCollector.getFigure(0);
    }

    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(2,4);
        shapeCollector.addFigure(triangle);
        //when
        Shape result = shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(triangle, result);
    }


    @Test
    public void testShowFigures() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(3,4);
        //when
        shapeCollector.addFigure(triangle);
        //then
        shapeCollector.showFigures();
    }

}
