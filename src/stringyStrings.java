public class stringyStrings {

    public static void main(String[] args) {
        stringy(10);
    }

    public static String stringy(int size) {
        String onesZeros = "";
        for (int i = 0; i < size; i++) {
            if (isEven(i)) {
                onesZeros = onesZeros + '1';

            } else {
                onesZeros = onesZeros + '0';

            }

        }
        return onesZeros;
    }

    private static boolean isEven (int number){
        return number % 2 == 0;
    }

}
