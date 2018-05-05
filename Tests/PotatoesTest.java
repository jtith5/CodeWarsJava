import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoesTest {

    @Test
    public void potatoes() {
        int initialWaterPercent = 99;
        int initialMass = 100;
        int finalWaterPercent = 98;
        int expected = 50;
        int actual = Potatoes.potatoes(initialWaterPercent, initialMass, finalWaterPercent);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void potatoestest2() {
        int initialWaterPercent = 82;
        int initialMass = 127;
        int finalWaterPercent = 80;
        int expected = 114;
        int actual = Potatoes.potatoes(initialWaterPercent, initialMass, finalWaterPercent);
        Assert.assertEquals(expected, actual);
    }
}