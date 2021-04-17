package mock_tests;

import lab1.Ellipsoid.Ellipsoid;
import lab1.Ellipsoid.EllipsoidController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EllipsoidTest_mock {

    @Test
    void model_test_mock() {
        Ellipsoid ellipsoid = mock(Ellipsoid.class);

        when(ellipsoid.toString()).thenReturn("Center coords = (0.0, 0.0)\nSemi-major axes lengths: a=1.5, b=2.0");
        when(ellipsoid.getX()).thenReturn(0.3);
        when(ellipsoid.getY()).thenReturn(2.1);
        when(ellipsoid.getPerim()).thenReturn(10.0);

        EllipsoidController ce = new EllipsoidController(ellipsoid);

        assertEquals("Center coords = (0.0, 0.0)\nSemi-major axes lengths: a=1.5, b=2.0", ellipsoid.toString());
        assertEquals(0.3, ce.getCoordX());
        verify(ellipsoid).getX();
        assertEquals(2.1, ce.getCoordY());
        verify(ellipsoid).getY();
        assertEquals(10.0, ce.getEllipsoidPerim());
        verify(ellipsoid).getPerim();
    }

    @Test
    void controller_test_mock() {
        Ellipsoid ellipsoid = mock(Ellipsoid.class);
        EllipsoidController ce = mock(EllipsoidController.class);

        ce.setModel(ellipsoid);

        when(ce.toString()).thenReturn("Center coords = (1.0, 0.1)\nSemi-major axes lengths: a=2.5, b=7.0");
        when(ce.getCoordX()).thenReturn(1.0);
        when(ce.getCoordY()).thenReturn(0.1);
        when(ce.getEllipsoidPerim()).thenReturn(10.0);

        assertEquals("Center coords = (1.0, 0.1)\nSemi-major axes lengths: a=2.5, b=7.0", ce.toString());
        assertEquals(1.0, ce.getCoordX());
        verify(ce).getCoordX();
        assertEquals(0.1, ce.getCoordY());
        verify(ce).getCoordY();
        assertEquals(10.0, ce.getEllipsoidPerim());
        verify(ce).getEllipsoidPerim();

    }
}