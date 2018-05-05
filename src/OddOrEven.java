public class OddOrEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i : array)
            sum += i;

        if (isEven(sum))
            return "even";

        else return "odd";


    }
    public static boolean isEven (int value){
       return value % 2 == 0;
    }
}