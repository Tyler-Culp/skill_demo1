import org.junit.*;

import static org.junit.Assert.assertEquals;
import java.util.*;

public class multiplyTester{

    @Test
    public void multiplyTest1(){
        int ans = Multiply.mult(2, 3);
        assertEquals(6, ans);
    }
}
