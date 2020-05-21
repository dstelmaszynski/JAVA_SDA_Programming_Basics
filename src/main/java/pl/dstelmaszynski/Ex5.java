package pl.dstelmaszynski;

public class Ex5 {
    public static void minAndMax() {
        int[] tab1 = {1, 6, 9, 36, 2, 8};
        int max = tab1[0];
        int min = tab1[0];

        for (int j = 0; j < tab1.length; j++) {
            if (tab1[j] > max) {
                max = tab1[j];
            } else if (tab1[j] < min) {
                min = tab1[j];
            }
        }
        System.out.println("\nMinimum number: " + min);
        System.out.println("Maximum number" + max);
    }
}
