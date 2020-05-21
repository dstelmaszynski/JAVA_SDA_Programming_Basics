package pl.dstelmaszynski;

import java.util.Arrays;

public class Ex4 {

    public static void array(int[] arrayBefore) {
        System.out.println("\n" + Arrays.toString(arrayBefore));


        int[] arrayAfter = new int[3];
        int i;
        arrayAfter[0] = arrayBefore[2];
        arrayAfter[1] = arrayBefore[1];
        arrayAfter[2] = arrayBefore[0];
        for (i = 0; i <= 2; i++) {
            System.out.println(arrayAfter[i]);

        }
    }
}

