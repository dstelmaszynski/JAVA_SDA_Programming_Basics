package pl.dstelmaszynski;

public class Ex1 {
    public static void multiply(int number) {
        for (int i = 1; i < 5; i++) {
            String printStructure1 = (number + "*" + i + "=" + (number * i));
            System.out.println(printStructure1);
        }
    }
}
