package mock_tests;

import l1.ComplexNumber.ComplexNumber;
import l1.ComplexNumberExponential.ComplexNumberExponential;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ProxyPointTest_mock {

    //private ComplexNumber n = new ComplexNumber(1, 2);
    //private ComplexInterface proxy = (ComplexInterface) ComplexProxy.newProxyInstance(n);

    @Test
    void Proxy_mock_test() {
        ComplexNumber proxy = mock(ComplexNumberExponential.class);
        when(proxy.getReal()).thenReturn("1.0");
        assertEquals(proxy.getReal(), "1.0");
        verify(proxy).getReal();
    }
}