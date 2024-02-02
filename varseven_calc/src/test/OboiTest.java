package test;

import org.junit.Assert;
import org.junit.Test;

import varseven_calc.Oboi;

public class OboiTest {

    @Test
    public void testGetMetr() {
        Oboi oboi = new Oboi();
        oboi.setMetr(5.0);
        double expectedMetr = 5.0;
        double actualMetr = oboi.getMetr();
        Assert.assertEquals(expectedMetr, actualMetr, 0.001);
    }

    @Test
    public void testSetMetr() {
        Oboi oboi = new Oboi();
        oboi.setMetr(7.5);
        double expectedMetr = 7.5;
        double actualMetr = oboi.getMetr();
        Assert.assertEquals(expectedMetr, actualMetr, 0.001);
    }

    @Test
    public void testGeneration() {
        Oboi oboi = new Oboi();
        oboi.setMetr(10.0);
        oboi.generation();
        double expectedCost = 1500.0;
        double actualCost = oboi.getCost();
        Assert.assertEquals(expectedCost, actualCost, 0.001);
    }

}