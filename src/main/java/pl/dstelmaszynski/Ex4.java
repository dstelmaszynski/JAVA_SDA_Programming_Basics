package pl.dstelmaszynski;

import java.util.Arrays;

public class Ex4 {

    public static void array(int[] tab) {
        int[] arrayBefore = {12, 7, 9};
        System.out.println(Arrays.toString(arrayBefore));


        int[] arrayAfter = new int[3];
        int i;
        arrayAfter[0] = tab[2];
        arrayAfter[1] = tab[1];
        arrayAfter[2] = tab[0];
        for (i = 0; i < 2; i++) {
            System.out.println(arrayAfter[i]);

        }
    }

    public static void main(String[] args) {
        //poniżej próba wywołania metody, która nie działa.
//        array(12, 7, 9);
    }
}

