package tests;

import l1.ComplexNumber.ComplexNumber;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private ComplexNumber n = new ComplexNumber(1, 2);
    private ComplexNumber n1 = new ComplexNumber(6, 1.5);
    private ComplexNumber n2 = new ComplexNumber(0, 1.5);

    @Test
    @DisplayName("Test for sumNumbers")
    void sumNumbers() {
        assertEquals(n.sumNumbers(n1).toString(), "7.0 + 3.5i");
        assertEquals(n2.sumNumbers(n2).toString(), "3.0i");
        assertNotEquals(n.sumNumbers(n1).toString(), "3.5i");
    }

    @Test
    @DisplayName("Test for minusNumbers")
    void minusNumbers() {
        assertEquals(n.minusNumbers(n1).toString(), "-5.0 + 0.5i");
        assertNotEquals(n.minusNumbers(n2).toString(), "0.7i");
    }

    @Test
    @DisplayName("Test for timesNumbers")
    void timesNumbers() {
        assertEquals(n.timesNumbers(n1).toString(), "6.5 + 6.5i");
        assertEquals(n.timesNumbers(n2).toString(), "0.5 + 0.5i");
        assertNotEquals(n.timesNumbers(n).toString(), "-1.5i");
    }

    @Test
    @DisplayName("Test for setReal")
    void setReal() {
        assertEquals(n.setReal(6), 6.0);
        assertNotEquals(n.setReal(4), 2.0);
    }

    @Test
    @DisplayName("Test for setImaginary")
    void setImaginary() {
        assertEquals(n.setImaginary(3), 3.0);
        assertNotEquals(n.setImaginary(8), 5.0);
    }

    @Test
    @DisplayName("Test for toString")
    void testToString() {
        assertEquals(n.toString(), "1.0 + 2.0i");
        assertNotEquals(n.toString(), "2.0i");
    }

    @Test
    @DisplayName("Test for getReal")
    void getReal() {
        assertEquals(n.getReal(), "1.0");
        assertNotEquals(n.getReal(), "2.0");
    }

    @Test
    @DisplayName("Test for getImaginary")
    void getImaginary() {
        assertEquals(n.getImaginary(), "2.0i");
        assertNotEquals(n.getImaginary(), "1.0");
    }


}