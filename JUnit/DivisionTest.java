package JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    @Test
    void testExceptionThrown() {
        assertThrows(ArithmeticException.class, () -> divide(10, 0));
    }
}
