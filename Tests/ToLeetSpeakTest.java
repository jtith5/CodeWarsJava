import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToLeetSpeakTest {

    @Test
    public void toLeetSpeak() {
        String speak = "LEET";
        String expected = "1337";
        String actual = ToLeetSpeak.toLeetSpeak(speak);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void toLeetSpeak2() {
        String speak = "CODEWARS";
        String expected = "(0D3W@R$";
        String actual = ToLeetSpeak.toLeetSpeak(speak);
        Assert.assertEquals(expected,actual);
    }
}