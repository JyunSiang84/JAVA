package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(4.0, calculator.add(2.0, 2.0));
        assertEquals(0.0, calculator.add(-2.0, 2.0));
        assertEquals(-4.0, calculator.add(-2.0, -2.0));
    }

    @Test
    void testSubtract() {
        assertEquals(0.0, calculator.subtract(2.0, 2.0));
        assertEquals(-4.0, calculator.subtract(2.0, 6.0));
        assertEquals(4.0, calculator.subtract(2.0, -2.0));
    }

    @Test
    void testMultiply() {
        assertEquals(4.0, calculator.multiply(2.0, 2.0));
        assertEquals(-4.0, calculator.multiply(2.0, -2.0));
        assertEquals(0.0, calculator.multiply(2.0, 0.0));
    }

    @Test
    void testDivide() {
        assertEquals(1.0, calculator.divide(2.0, 2.0));
        assertEquals(-1.0, calculator.divide(2.0, -2.0));
        assertThrows(IllegalArgumentException.class, () -> 
            calculator.divide(2.0, 0.0));
    }
}
