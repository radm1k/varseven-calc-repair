package test;

import org.junit.Test;

import varseven_calc.SuspendedCeilings;

import static org.junit.Assert.*;

public class SuspendedCeilingsTest {

    @Test
    public void testGetMetr() {
        SuspendedCeilings ceilings = new SuspendedCeilings();
        ceilings.setMetr(10.0);
        double expected = 10.0;
        double actual = ceilings.getMetr();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testSetMetr() {
        SuspendedCeilings ceilings = new SuspendedCeilings();
        ceilings.setMetr(10.0);
        double expected = 10.0;
        double actual = ceilings.getMetr();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testGeneration() {
        SuspendedCeilings ceilings = new SuspendedCeilings();
        ceilings.setMetr(10.0);
        ceilings.generation();
        double expected = 7000.0;
        double actual = ceilings.getCost();
        assertEquals(expected, actual, 0.01);
    }
}