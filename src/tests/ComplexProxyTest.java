package tests;

import l1.ComplexInterface;
import l1.ComplexNumber;
import l1.ComplexNumberExponential;
import l1.ComplexProxy;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ComplexProxyTest {

    private ComplexNumber n1 = new ComplexNumber(1, 2);
    private ComplexInterface proxy = (ComplexInterface) ComplexProxy.newProxyInstance(n1);

    @Test
    @DisplayName("Test for invoke")
    void invoke() {
        assertEquals(proxy.getReal(), "1.0");
        assertNotEquals(proxy.getReal(), "2.0");
    }

    @Test
    @DisplayName("Test for newProxyInstance")
    void newProxyInstance() {
    }
}