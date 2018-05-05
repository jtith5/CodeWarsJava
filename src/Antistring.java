public class Antistring {

//        given an input string str, return a string such that
//        all letters change case
//        all digits are replaced with it's compliment to 9 (0 => 9, 1 => 8...)
//        each letter is replaced by it's compliment in the alphabet
//        (a => z, B => Y, c => x...)
//        the result is reversed

    public static String antiString(String str) {
        Character currentCharacter = null;
        String returnString = "";
        for (int i = 0; i < str.length(); i++) {
            currentCharacter = str.charAt(i);
            if (isNumber(currentCharacter)) {
                returnString += numberCompliment(currentCharacter);
            } else {
                currentCharacter = changeCase(currentCharacter);
                if (determineCase(currentCharacter).equals("lowercase")) {
                    returnString += letterComplimentLowerCase(currentCharacter);
                }
                else {
                    returnString += letterComplimentUpperCase(currentCharacter);
                }
            }
        }
        return reverseResults(returnString);
    }

    public static boolean isNumber(Character character) {
        try {
            Integer.parseInt(character.toString());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    public static String numberCompliment(String string) {
        String returnString = "";
        Character currentCharacter = null;
        for (int i = 0; i < string.length(); i++) {
            currentCharacter = string.charAt(i);
            try {
                returnString += numberCompliment(currentCharacter);
            } catch (Exception numberFormatException) {
                returnString += currentCharacter;
                System.err.println(currentCharacter + " is not a number. Appending the character to the " +
                        "return string.");
            }
        }
        return returnString;
    }


    public static String changeCase(String string) {
        String returnString = "";
        for (int i = 0; i < string.length(); i++) {
            returnString += changeCase(string.charAt(i));
        }
        return returnString;
    }

    public static Character changeCase(Character letter) {
        if (determineCase(letter).equals("lowercase")) {
            return Character.toUpperCase(letter);
        }
        return Character.toLowerCase(letter);
    }

    public static Character numberCompliment(Character number) {
        Integer result = 9 - Integer.parseInt(number.toString());
        Character resultCharacter = result.toString().charAt(0);
        return resultCharacter;
    }

    public static Character letterComplimentUpperCase(Character letter) {
        letter = changeCase(letter);
        return changeCase(letterCompliment(letter));
    }

    public static Character letterComplimentLowerCase(Character letter) {
        return letterCompliment(letter);
    }

    private static Character letterCompliment(Character letter) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Integer currentIndexInAlphabet = alphabet.indexOf(letter);
        Integer positionDesired = alphabet.indexOf('z');
        Integer result = positionDesired - currentIndexInAlphabet;
        Character returnCharacter = alphabet.charAt(result);
        return returnCharacter;
    }

    public static String determineCase(Character character) {
        if (character.equals(character.toString().toLowerCase().charAt(0))) {
            return "lowercase";
        }
        return "uppercase";
    }

    public static String reverseResults(String results) {
        return new StringBuilder(results).reverse().toString();
    }
}







