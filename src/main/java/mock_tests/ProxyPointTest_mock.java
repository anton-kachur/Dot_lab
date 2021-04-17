package mock_tests;

import lab1.Ellipsoid.Ellipsoid;
import lab1.Point.Point;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProxyPointTest_mock {

    @Test
    void Proxy_mock_test() {
        Point proxy = mock(Ellipsoid.class);

        when(proxy.toString()).thenReturn("Point(1.0, 2.0)");
        assertEquals(proxy.toString(), "Point(1.0, 2.0)");

        when(proxy.getX()).thenReturn(1.0);
        assertEquals(proxy.getX(), 1.0);
        verify(proxy).getX();

        when(proxy.getY()).thenReturn(2.0);
        assertEquals(proxy.getY(), 2.0);
        verify(proxy).getY();
    }
}