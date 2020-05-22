package pl.dstelmaszynski;

//Main method - to launch
public class Main {
    public static void main(String[] args) {
//        multiply method
        Ex1.multiply(5);

//        prime number method
        Ex2.primeNumb(3);

        //sum method
        Ex3.sum(6, 13);

        //array changing method
        int[] arrayBefore = {12, 7, 9};
        Ex4.array(arrayBefore);


        //array min and max numbers
        Ex5.minAndMax();
    }
}
