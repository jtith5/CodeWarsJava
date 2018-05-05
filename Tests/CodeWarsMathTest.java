import org.junit.Test;

import static org.junit.Assert.*;

public class CodeWarsMathTest {

    @Test
    public void nearestSq() {
        CodeWarsMath codeWarsMath = new CodeWarsMath();
        assertEquals(1, codeWarsMath.nearestSq(1));
        assertEquals(1, codeWarsMath.nearestSq(2));
        assertEquals(9, codeWarsMath.nearestSq(10));
        assertEquals(121, codeWarsMath.nearestSq(111));
        assertEquals(10000, codeWarsMath.nearestSq(9999));
    }

    @Test
    public void wholeNumberTrue() {
        CodeWarsMath codeWarsMath = new CodeWarsMath();
        boolean actual = codeWarsMath.isWholeNumber(11.00000000000000);
        assertTrue(actual);
    }

    @Test
    public void wholeNumberFalse() {
        CodeWarsMath codeWarsMath = new CodeWarsMath();
        boolean actual = codeWarsMath.isWholeNumber(11.567);
        assertFalse(actual);
    }

    @Test
    public void wholeNumberFalse2() {
        CodeWarsMath codeWarsMath = new CodeWarsMath();
        boolean actual = codeWarsMath.isWholeNumber(11.000000000000005);
        assertFalse(actual);
    }

}