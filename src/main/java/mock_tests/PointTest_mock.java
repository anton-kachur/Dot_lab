package mock_tests;

import lab1.Point.Point;
import lab1.Point.PointController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PointTest_mock {

    @Test
    void model_test_mock() {
        Point p = mock(Point.class);
        when(p.getX()).thenReturn(0.0);
        when(p.getY()).thenReturn(0.0);
        when(p.toString()).thenReturn("Point(0.0, 0.0)");
        when(p.setX(2.2)).thenReturn(2.2);
        when(p.setY(1.1)).thenReturn(1.1);

        PointController pc = new PointController(p);

        assertEquals("Point(0.0, 0.0)", p.toString());
        assertEquals(0.0, pc.getCoordX());
        verify(p).getX();
        assertEquals(0.0, pc.getCoordY());
        verify(p).getY();
        assertEquals(2.2, pc.setCoordX(2.2));
        verify(p).setX(2.2);
        assertEquals(1.1, pc.setCoordY(1.1));
        verify(p).setY(1.1);
    }

    @Test
    void controller_test_mock() {
        Point p = mock(Point.class);
        PointController pc = mock(PointController.class);

        pc.setModel(p);

        when(pc.getCoordX()).thenReturn(0.0);
        when(pc.getCoordY()).thenReturn(0.0);
        when(pc.toString()).thenReturn("Point(0.0, 0.0)");
        when(pc.setCoordX(2.3)).thenReturn(2.3);
        when(pc.setCoordY(2.2)).thenReturn(2.2);

        assertEquals("Point(0.0, 0.0)", pc.toString());
        assertEquals(0.0, pc.getCoordY());
        verify(pc).getCoordY();
        assertEquals(0.0, pc.getCoordX());
        verify(pc).getCoordX();
        assertEquals(2.3, pc.setCoordX(2.3));
        verify(pc).setCoordX(2.3);
        assertEquals(2.2, pc.setCoordY(2.2));
        verify(pc).setCoordY(2.2);
    }

}