public class XO {

    public static boolean getXO (String str) {
        str = str.toLowerCase();
        int numberOfXs = frequencyOfCharacter('x', str);
        int numberOfOs = frequencyOfCharacter('o', str);
//        if (numberOfXs == 0 && numberOfOs == 0) {
//            return false;
//        }
//        System.out.println("Number of O's: " + numberOfOs);
//        System.out.println("Number of X's: " + numberOfXs + "\n");
        return numberOfOs == numberOfXs;
    }

    private static int frequencyOfCharacter(char character, String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
