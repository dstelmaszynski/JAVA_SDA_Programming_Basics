package pl.dstelmaszynski;

import java.util.Arrays;

public class Ex6 {
    //podaj metodę
    public static int[] negativeTable(int[] tab1) {
        System.out.println("\n" + Arrays.toString(tab1));

        //przeiteruj po wszystkich elementach danej tablicy w celu uzyskania info ile jest szukanych elementów (np. utwórz zmienną counter)
        int counter = 0;
        for (int i : tab1) {
            if (i < 0) {
                counter++;
            }
        }

        //przeiteruj wszystkie elementy tablicy i przypisz je do nowej tablicy
        int[] tab2 = new int[counter];
        int j = 0; //nowa zmienna do nadpisywania wartości w tablicy (bo jest zwykły for)
        for (int k = 0; k < tab1.length; k++) {
            if (tab1[k] < 0) {
                tab2[j] = tab1[k];
                j++;
            }
        }
        for (int l : tab2) {
            System.out.println(l);
        }
        return tab2;
    }
}
