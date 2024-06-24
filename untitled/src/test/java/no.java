import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class no {
    @Test
    public void testFactorial() {
        yes calculator = new yes();
        assertEquals(1, calculator.calculateFactorial(0));
        assertEquals(1, calculator.calculateFactorial(1));
        assertEquals(2, calculator.calculateFactorial(2));
        assertEquals(6, calculator.calculateFactorial(3));
        assertEquals(24, calculator.calculateFactorial(4));
    }
}
