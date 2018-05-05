import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Integer[] array = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = args[i];
        }

        List<Integer> numbers = Arrays.asList(array);
        System.out.println(numbers.getClass().getSimpleName());
        return Collections.min(numbers);
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{1,2,3}));

    }
}