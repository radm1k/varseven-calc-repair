package test;
import org.junit.Test;
import varseven_calc.StrippingPaint;
import static org.junit.Assert.*;
public class StrippingPaintTest {
    @Test
    public void testGetMetr() {
        StrippingPaint paint = new StrippingPaint();
        paint.setMetr(10.0);
        double expected = 10.0;
        double actual = paint.getMetr();
        assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testSetMetr() {
        StrippingPaint paint = new StrippingPaint();
        paint.setMetr(10.0);
        double expected = 10.0;
        double actual = paint.getMetr();
        assertEquals(expected, actual, 0.01);
    }
    @Test
    public void testGeneration() {
        StrippingPaint paint = new StrippingPaint();
        paint.setMetr(10.0);
        paint.generation();
        double expected = 1000.0;
        double actual = paint.getCost();
        assertEquals(expected, actual, 0.01);
    }
}