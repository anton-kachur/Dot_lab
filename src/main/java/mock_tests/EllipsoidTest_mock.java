package mock_tests;

import l1.ComplexNumber.ComplexNumber;
import l1.ComplexNumber.ComplexNumberController;
import l1.ComplexNumberExponential.ComplexNumberExponential;
import l1.ComplexNumberExponential.ComplexNumberExponentialController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class EllipsoidTest_mock {

    @Test
    void model_test_mock() {
        ComplexNumberExponential n = mock(ComplexNumberExponential.class);
        when(n.toString()).thenReturn("4e^i0");

        ComplexNumberExponentialController c = new ComplexNumberExponentialController(n);
        assertEquals(c.toString(), "4e^i0");
    }

    @Test
    void controller_test_mock() {
        ComplexNumberExponential n = mock(ComplexNumberExponential.class);
        ComplexNumberExponentialController c = mock(ComplexNumberExponentialController.class);

        c.setModel(n);

        when(c.toString()).thenReturn("4e^i0");
        assertEquals(c.toString(), "4e^i0");
    }
}