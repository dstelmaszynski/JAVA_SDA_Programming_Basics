public class Test1 {


    public static boolean primeNumb(int numberToCheck) {
        if (numberToCheck < 2)
            return false;
        boolean isPrime = true;
        for (int k = 2; k < numberToCheck; k++) {
            if (numberToCheck % k == 0)
                isPrime = false;
            break;
        }
        System.out.println(isPrime);
        return isPrime;
    }
    public static void main (String[] args){
        primeNumb(17);
    }
}