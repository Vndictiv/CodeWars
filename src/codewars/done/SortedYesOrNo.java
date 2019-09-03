package codewars.actual;

import java.util.Arrays;
import java.util.Collections;

public class SortedYesOrNo {

    public static String isSortedAndHow(int[] array) {

        Integer[] myTab = new Integer[array.length];

        for (int i = 0; i <array.length; i++){
            myTab[i] = array[i];
        }

        Arrays.sort(myTab);

        for (int j = 0; j <array.length; j++){
            System.out.println("myTab: " +myTab[j]);
            System.out.println("array: " +array[j]);
            if (myTab[0] == array[0] && myTab[myTab.length-1] == array[array.length-1])
                return "yes, ascending";
        }

        Arrays.sort(myTab, Collections.reverseOrder());

        for (int k = 0; k <array.length; k++)
            if (myTab[0] == array[0] && myTab[myTab.length-1] == array[array.length-1])
                return "yes, descending";


            return "no";
    }

    public static void main(String[] args) {
        int[] tab = new int[]{50,31,11,2,-5};

        System.out.println(isSortedAndHow(tab));
    }
}
