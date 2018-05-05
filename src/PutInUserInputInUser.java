import java.util.Scanner;

public class PutInUserInputInUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something that you would like inside of you?");
        String userInput = scanner.nextLine();
        System.out.println("We are now inserting " +userInput+" into you.");
    }
}
