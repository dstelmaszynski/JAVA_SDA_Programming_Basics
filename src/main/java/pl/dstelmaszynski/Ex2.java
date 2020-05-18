package pl.dstelmaszynski;

public class Ex2 {
    //    metoda, czy dana liczba jest pierwsza
    public static boolean primeNumb(int randomNumb) {
        if (randomNumb < 2)
            return false;
        boolean isPrime = true;
        for (int i = 2; i < randomNumb; i++) {
            if (randomNumb % i == 0)
                isPrime = false;
            break;
        }
        System.out.println("\n" + isPrime);
        return isPrime;
    }
}

