package tests;

import lab1.Ellipsoid.Ellipsoid;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class EllipsoidTest {
    private final Ellipsoid ellipsoid = new Ellipsoid(new double[]{1.1, 2.2, 0.0, 0.0, 3, 4});

    @Test
    @DisplayName("toString test")
    void tString() {
        assertEquals(ellipsoid.toString(), "Center coords = (0.0, 0.0)\nSemi-major axes lengths: a=1.5, b=2.0");
        assertNotEquals(ellipsoid.toString(), "Center coords = (0.0, 0.0)\nSemi-major axes lengths: a=3.0, b=4.0");
    }

    @Test
    @DisplayName("getX test")
    public void getX() {
        assertEquals(ellipsoid.getX(), 0.0);
        assertNotEquals(ellipsoid.getX(), 0.1);
    }

    @Test
    @DisplayName("getY test")
    public void getY() {
        assertEquals(ellipsoid.getY(), 0.0);
        assertNotEquals(ellipsoid.getY(), 0.1);
    }

    @Test
    @DisplayName("getPerim test")
    public void getPerim() {
        ellipsoid.getPerim();
        assertEquals(ellipsoid.getPerim(), 10.485);
    }
}