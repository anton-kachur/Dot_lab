package tests;

import lab1.Point.Point;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private final Point p= new Point(3.4, 2.1);

    @Test
    @DisplayName("toString test")
    void tString() {
        assertEquals(p.toString(), "Point(3.4, 2.1)");
    }

    @Test
    @DisplayName("setX test")
    void setX() {
        assertEquals(p.setX(0.2), 0.2);
        assertNotEquals(p.setX(1.1), 3.0);
    }

    @Test
    @DisplayName("setY test")
    void setY() {
        assertEquals(p.setY(3.1), 3.1);
        assertNotEquals(p.setY(9.9), 4.4);
    }

    @Test
    @DisplayName("getX test")
    void getX() {
        assertEquals(p.getX(), 3.4);
        assertNotEquals(p.getX(), 3.3);
    }

    @Test
    @DisplayName("getY test")
    void getY() {
        assertEquals(p.getY(), 2.1);
        assertNotEquals(p.getY(), 2.0);
    }
}