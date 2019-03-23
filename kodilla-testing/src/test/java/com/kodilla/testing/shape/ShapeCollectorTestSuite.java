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
    @Test
    public void testRemoveFigure() {

    }
    @Test
    public void testGetFigure() {

    }
    @Test
    public void testShowFigures() {

    }

}
