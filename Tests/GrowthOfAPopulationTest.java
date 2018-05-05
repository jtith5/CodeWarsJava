import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrowthOfAPopulationTest {

    @Test
    public void nbYear() {
        int intialPop = 1500, aug = 100, targetPop = 5000;
        double percent = 5;
        int expected = 15;
        int actual = GrowthOfAPopulation.nbYear(intialPop, percent, aug, targetPop);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void nbYearTest2() {
        int intialPop = 1500000, aug = 10000, targetPop = 2000000;
        double percent = 2.5;
        int expected = 10;
        int actual = GrowthOfAPopulation.nbYear(intialPop, percent, aug, targetPop);
        Assert.assertEquals(expected, actual);
    }
}