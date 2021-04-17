package tests;

import lab1.Point.Point;
import lab1.PointInterface;
import lab1.ProxyPoint.ProxyPoint;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProxyPointTest {
    private final Point p = new Point(0.0, 1.0);
    private final PointInterface proxy = (PointInterface) ProxyPoint.newProxyInstance(p);

    @Test
    @DisplayName("Test for invoke")
    void invoke() {
        assertEquals(proxy.getX(), 0.0);
        assertEquals(proxy.getY(), 1.0);
    }

    @Test
    @DisplayName("Test for newProxyInstance")
    void newProxyInstance() {
    }
}