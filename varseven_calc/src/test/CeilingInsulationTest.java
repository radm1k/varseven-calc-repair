package test;

import static org.junit.Assert.*;
import org.junit.Test;

import varseven_calc.CeilingInsulation;

public class CeilingInsulationTest {

    @Test
    public void testGetMetr() {
        CeilingInsulation insulation = new CeilingInsulation();
        insulation.setMetr(10.0);
        double expected = 10.0;
        double actual = insulation.getMetr();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testSetMetr() {
        CeilingInsulation insulation = new CeilingInsulation();
        insulation.setMetr(10.0);
        double expected = 10.0;
        double actual = insulation.getMetr();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testGeneration() {
        CeilingInsulation insulation = new CeilingInsulation();
        insulation.setMetr(10.0);
        insulation.generation();
        double expected = 1100.0;
        double actual = insulation.getCost();
        assertEquals(expected, actual, 0.01);
    }
}
