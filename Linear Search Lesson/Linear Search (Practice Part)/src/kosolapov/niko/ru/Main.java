package kosolapov.niko.ru;


public class Main {

    public static int linearSearch(int key, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // 1)Let's suppose, that we have the array with following numbers: 12 , 23 , 1 , 43 , 43 , 2 , 89 , 55.
        int[] numbers = {12, 23, 1, 43, 43, 2, 89, 55};

        // 2) We need to find number 2 and print the result. We will use Linear Search for this. Look at the linearSearch(int key , int[] numbers).
        System.out.println(linearSearch(2, numbers));

    }
}