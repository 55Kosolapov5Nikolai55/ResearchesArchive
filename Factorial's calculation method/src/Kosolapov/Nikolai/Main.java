package Kosolapov.Nikolai;


public class Main {

    public static int calculateFactorial(int n){
        if(n > 0) {
            if (n == 1) {
                return n;
            }
            return n * calculateFactorial(n - 1);
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(calculateFactorial(5));
        System.out.println(calculateFactorial(1));
        System.out.println(calculateFactorial(- 220));

    }
}
