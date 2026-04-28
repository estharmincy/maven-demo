import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumTest {

    @Test
    void testAdd() {
        Sum s = new Sum();
        assertEquals(5, s.add(2, 3));
    }
}