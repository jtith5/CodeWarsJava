import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoorTest {

    @Test
    public void open() {
    }

    @Test
    public void create3Doors() {
    }

    @Test
    public void randomNumberBetween0And1() {
        for (int i = 0; i < 1000; i++) {
            int actual = Door.randomNumberBetween0And1();
            //System.out.println(actual);
            if (actual == 0 || actual == 1) {
                assertTrue(true);
            }
            else {
                Assert.fail();
            }
        }
    }

    @Test
    public void trueOrFalse() {
        for (int i = 0; i < 1000; i++) {
            Boolean bool = Door.trueOrFalse();
            //System.out.println(bool);
            if (bool) {
                assertTrue(true);
            }
            else if (!bool) {
                assertTrue(true);
            }
        }
    }

    @Test
    public void create3DoorTest() {
        Door[] doorArray = new Door[3];
        doorArray = Door.create3Doors();
        int expectedNumberOfGoats = 2;
        int expectedNumberOfCars = 1;
        int actualNumberOfGoats = 0;
        int actualNumberOfCars = 0;
        for (int i = 0; i < doorArray.length; i++) {
            if (doorArray[i].getHasCar()) {
                actualNumberOfCars++;
            }
            else {
                actualNumberOfGoats++;
            }
        }
        Assert.assertEquals(expectedNumberOfCars, actualNumberOfCars);
        Assert.assertEquals(expectedNumberOfGoats, actualNumberOfGoats);
    }

    @Test
    public void create3DoorTest1000Times() {
        for (int i = 0; i < 1000; i++) {
            create3DoorTest();
        }
    }

    @Test
    public void openDoorTestHasCar() {
        Door door = new Door(true);
        String actual = door.open();
        String expected = "This door has a car behind it!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void openDoorTestHasGoat() {
        Door door = new Door(false);
        String actual = door.open();
        String expected = "That's a goat bitch!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doorPictureTest() {
        String actual = Door.getDoorPicture();
        String expected = " __________       __________       __________\n" +
                "|  __  __  |     |  __  __  |     |  __  __  |\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | |\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | |\n" +
                "| |__||__| |     | |__||__| |     | |__||__| |\n" +
                "|  __  __()|     |  __  __()|     |  __  __()|\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | |\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | | \n" +
                "| |__||__| |     | |__||__| |     | |__||__| |\n" +
                "|__________|     |__________|     |__________|";

        Assert.assertEquals(expected, actual);
    }
}
