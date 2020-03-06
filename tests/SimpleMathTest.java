import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMathTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void sum() {
        SimpleMath math = new SimpleMath(4, 7);
        int expResult = 11;
        assertEquals(expResult, math.sum());
    }
}