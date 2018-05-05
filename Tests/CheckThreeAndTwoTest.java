import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckThreeAndTwoTest {

    @Test
    public void checkThreeAndTwo() {
        char[] chars = { 'a', 'a', 'b', 'b', 'b' };
        boolean expected = true;
        boolean actual = new CheckThreeAndTwo().checkThreeAndTwo(chars);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void checkThreeAndTwo2() {
        char[] chars = { 'a', 'c', 'a', 'c', 'b' };
        boolean expected = false;
        boolean actual = new CheckThreeAndTwo().checkThreeAndTwo(chars);
        Assert.assertEquals(expected,actual);
    }
}