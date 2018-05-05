import java.util.Scanner;

public class MontyHall {
    public static void main(String[] args) {
        System.out.println("Which door do you pick?");
        Door[] doorArray = new Door[3];
        doorArray = Door.create3Doors();
        System.out.println(Door.getDoorPicture());
        Scanner scanner = new Scanner(System.in);
        int doorSelection = scanner.nextInt();


    }
}



class Door {

    private Boolean hasCar;

    public Door(Boolean hasCar) {
        this.hasCar = hasCar;
    }

    public static String getDoorPicture() {
        return  " __________       __________       __________\n" +
                "|  __  __  |     |  __  __  |     |  __  __  |\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | |\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | |\n" +
                "| |__||__| |     | |__||__| |     | |__||__| |\n" +
                "|  __  __()|     |  __  __()|     |  __  __()|\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | |\n" +
                "| |  ||  | |     | |  ||  | |     | |  ||  | | \n" +
                "| |__||__| |     | |__||__| |     | |__||__| |\n" +
                "|__________|     |__________|     |__________|";
    }

    public Boolean getHasCar() {
        return hasCar;
    }

    public String open() {
        if (this.hasCar) {
            return "This door has a car behind it!";
        }
        return "That's a goat bitch!";
    }

    public static Door[] create3Doors() {
        Door[] doorArray = new Door[3];
        Door door1 = new Door(trueOrFalse());
        Door door2 = null;
        Door door3 = null;
        if (door1.hasCar) {
            //door2 and 3 should have goats
            door2 = new Door(false);
            door3 = new Door(false);
        }
        if (!door1.hasCar) {
            door2 = new Door(trueOrFalse());
            if (door2.hasCar) {
                door3 = new Door(false);
            }
            else {
                door3 = new Door(true);
            }
        }
        doorArray[0] = door1;
        doorArray[1] = door2;
        doorArray[2] = door3;
        return doorArray;
    }

    public static int randomNumberBetween0And1() {
        return (int)Math.floor(Math.random() * 2);
    }

    public static Boolean trueOrFalse() {
        return randomNumberBetween0And1() == 1;
    }
}