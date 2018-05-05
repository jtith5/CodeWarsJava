import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOrEvenTest {

    @Test
    public void oddOrEven() {
        int[] array = {2, 5, 34, 6};
        String expected = "odd";
        String actual = OddOrEven.oddOrEven(array);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isEven() {
        int value = 4;
        boolean expected = true;
        boolean actual = OddOrEven.isEven(value);
        Assert.assertEquals(expected, actual);
    }
}