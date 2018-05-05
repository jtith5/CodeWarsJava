import com.sun.corba.se.impl.ior.ObjectAdapterIdArray;

import java.util.*;

public class Minimum{
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 3;
        array[2] = 1;

        int[] anotherArray = new int[] {5, 7, 5, 9, 7};

        int[] aThirdArray = {1, 3, 1};

        System.out.println(minValue(anotherArray));
    }

        public static int minValue ( int[] values){
            Integer[] array = new Integer[values.length];
            for (int i = 0; i < values.length; i++) {
                array[i] = values[i];
            }

            //printArray(array);

           Arrays.sort(array);

          // printArray(array);
            Set <Integer> duplicatesRemoved = new HashSet<>();
            for (int i = 0; i < array.length; i++)
                duplicatesRemoved.add(array[i]);

            Object[] objectArray;

            objectArray =  duplicatesRemoved.toArray();

            String number = "";
            for (Object integer : objectArray) {
                number += integer;
            }
            return Integer.parseInt(number);
        }


        private static void printArray(Integer[] array) {
            for (Integer element : array) {
                System.out.println(element);
            }
        }


}

