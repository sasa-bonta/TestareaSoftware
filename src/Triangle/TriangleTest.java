package Triangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle = new Triangle();
    @Test
    public void TriangleTest1() {
        boolean t1;
        t1 = triangle.createTriangle(0, 2, 3);
        assertEquals(t1, false);
    }
    @Test
    public void TriangleTest2() {
        boolean t1;
        t1 = triangle.createTriangle(-5, -4, -3);
        assertEquals(t1, false);
    }
    @Test
    public void TriangleTest3() {
        boolean t1;
        t1 = triangle.createTriangle(1, 5, 2);
        assertEquals(t1, false);
    }
    @Test
    public void TriangleTest4() {
        boolean t1;
        t1 = triangle.createTriangle(10, 7, 9);
        assertEquals(t1, true);
    }
//    @Test
//    public void TriangleTest5() {
//        boolean t1;
//        t1 = triangle.createTriangle(30_000_000_000, 30_000_000_000, 30_000_000_000);
//        assertEquals(t1, false);
//    }
}
