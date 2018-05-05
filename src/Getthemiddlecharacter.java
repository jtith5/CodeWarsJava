class Kata {
    public static String getMiddle(String word) {
    int wordLength = word.length();
    boolean isEven = isEven(wordLength);
    if (isEven) {
        return word.substring((wordLength/2) - 1,(wordLength/2)+1);
    }
    else {
        return word.substring((wordLength/2),(wordLength/2)+1);
    }

    }
    public static boolean isEven (int length) {
        return length % 2 == 0;
    }

}