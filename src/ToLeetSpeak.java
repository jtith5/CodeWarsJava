import java.util.HashMap;

public class ToLeetSpeak {
    static String toLeetSpeak(final String speak) {
        HashMap<Character,Character> leetMap = populateHashMap();
        String leetString = "";
        for (int i = 0; i < speak.length(); i++){
            Character current = leetMap.get(speak.charAt(i));
            if (current != null) {
                leetString += current;
            }
            else {
                leetString += speak.charAt(i);
            }
        }
        return leetString;
    }
    public static HashMap<Character,Character> populateHashMap () {
        HashMap<Character,Character> leetMap = new HashMap<>();
        leetMap.put('A','@');
        leetMap.put('B','8');
        leetMap.put('C','(');
        leetMap.put('D','D');
        leetMap.put('E','3');
        leetMap.put('F','F');
        leetMap.put('G','6');
        leetMap.put('H','#');
        leetMap.put('I','!');
        leetMap.put('J','J');
        leetMap.put('K','K');
        leetMap.put('L','1');
        leetMap.put('M','M');
        leetMap.put('N','N');
        leetMap.put('O','0');
        leetMap.put('P','P');
        leetMap.put('Q','Q');
        leetMap.put('R','R');
        leetMap.put('S','$');
        leetMap.put('T','7');
        leetMap.put('U','U');
        leetMap.put('V','V');
        leetMap.put('W','W');
        leetMap.put('X','X');
        leetMap.put('Y','Y');
        leetMap.put('Z','2');
        leetMap.put(' ',' ');
        return leetMap;
    }
}

