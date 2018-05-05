public class NeedleInAHayStack {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++){
            if ( "needle".equals(haystack[i])){
                return "found the needle at position " + i;
            }
        }
        return null;
    }
}
