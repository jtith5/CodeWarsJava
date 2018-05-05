import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AntistringTest {

    @Test
    public void antiString() {
        String str = "abcWXY123";
        String expected = "678bcdXYZ";
        String actual = Antistring.antiString(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberTrueTest() {
        boolean expected = true;
        boolean actual = Antistring.isNumber('5');
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberFalseTest() {
        boolean expected = false;
        boolean actual = Antistring.isNumber('b');
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void NumberComplimentInputStringTest() {
        String str = "abcWXY123";
        String expected = "abcWXY876";
        String actual = Antistring.numberCompliment(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ChangeCaseInputString() {
        String str = "AdTG34";
        String expected = "aDtg34";
        String actual = Antistring.changeCase(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeCaseLowercaseTest() {
        Character letter = 'w';
        Character expected = 'W';
        Character actual = Antistring.changeCase(letter);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void changeCaseUppercaseTest(){
        Character letter = 'Q';
        Character expected = 'q';
        Character actual = Antistring.changeCase(letter);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberCompliment() {
        Character number = '1';
        Character expected = '8';
        Character actual = Antistring.numberCompliment(number);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void numberCompliment2() {
        Character number = '4';
        Character expected = '5';
        Character actual = Antistring.numberCompliment(number);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = NumberFormatException.class)
    public void numberComplimentExceptionTest() {
        Character number = 't';
        Character expected = null;
        Character actual = Antistring.numberCompliment(number);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void letterComplimentLowerCaseTest1() {
        Character letter = 'a';
        Character expected = 'z';
        Character actual = Antistring.letterComplimentLowerCase(letter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void letterComplimentLowerCaseTest2() {
        Character letter = 'c';
        Character expected = 'x';
        Character actual = Antistring.letterComplimentLowerCase(letter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void letterComplimentLowerCaseTest3() {
        Character letter = 'o';
        Character expected = 'l';
        Character actual = Antistring.letterComplimentLowerCase(letter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void letterComplimentUpperCaseTest1() {
        Character letter = 'O';
        Character expected = 'L';
        Character actual = Antistring.letterComplimentUpperCase(letter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void letterComplimentUpperCaseTest2() {
        Character letter = 'T';
        Character expected = 'G';
        Character actual = Antistring.letterComplimentUpperCase(letter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void letterComplimentUpperCaseTest3() {
        Character letter = 'D';
        Character expected = 'W';
        Character actual = Antistring.letterComplimentUpperCase(letter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void determineCaseLowerCaseTest() {
        //given a character a
        Character character = 'a';
        // calling the determinecase method with a as an input will be stored in actual
        String actual = Antistring.determineCase(character);
        // Expected will be hardcoded to what we think the result should be given the logic from our method.
        String expected = "lowercase";
        //Assert to make sure that the actual and expected are the same value.
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void determineCaseNumberTest() {
        Character number = '2';
        String expected = "lowercase";
        String actual = Antistring.determineCase(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void determineCaseUpperCaseTest() {
        Character letter = 'A';
        String expected = "uppercase";
        String actual = Antistring.determineCase(letter);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void reverseResults(){
        String results = "a3d4";
        String expected = "4d3a";
        String actual = Antistring.reverseResults(results);
        Assert.assertEquals(expected,actual);
    }
}
