package mock_tests;

import l1.ComplexNumber.ComplexNumber;
import l1.ComplexNumber.ComplexNumberController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PointTest_mock {
    @Test
    void model_test_mock() {
        ComplexNumber n = mock(ComplexNumber.class);
        when(n.getImaginary()).thenReturn("2.0i");
        when(n.getReal()).thenReturn("1.0");
        when(n.toString()).thenReturn("1.0 + 2.0i");
        when(n.setImaginary(2)).thenReturn(2.0);
        when(n.setReal(1)).thenReturn(1.0);

        ComplexNumberController c = new ComplexNumberController(n);

        assertEquals("1.0 + 2.0i", c.toString());
        assertEquals("1.0", c.getNumberReal());
        verify(n).getReal();
        assertEquals("2.0i", c.getNumberImaginary());
        verify(n).getImaginary();
        assertEquals(1.0, c.setNumberReal(1));
        verify(n).setReal(1);
        assertEquals(2.0, c.setNumberImaginary(2));
        verify(n).setImaginary(2);
    }

    @Test
    void controller_test_mock() {
        ComplexNumber n = mock(ComplexNumber.class);
        ComplexNumberController c = mock(ComplexNumberController.class);

        c.setModel(n);

        when(c.getNumberImaginary()).thenReturn("2.0i");
        when(c.getNumberReal()).thenReturn("1.0");
        when(c.toString()).thenReturn("1.0 + 2.0i");
        when(c.setNumberImaginary(2)).thenReturn(2.0);
        when(c.setNumberReal(1)).thenReturn(1.0);

        assertEquals("1.0 + 2.0i", c.toString());
        assertEquals("1.0", c.getNumberReal());
        verify(c).getNumberReal();
        assertEquals("2.0i", c.getNumberImaginary());
        verify(c).getNumberImaginary();
        assertEquals(1.0, c.setNumberReal(1));
        verify(c).setNumberReal(1);
        assertEquals(2.0, c.setNumberImaginary(2));
        verify(c).setNumberImaginary(2);
    }

}