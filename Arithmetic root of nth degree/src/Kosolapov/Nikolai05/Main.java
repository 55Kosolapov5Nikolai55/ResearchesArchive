package Kosolapov.Nikolai05;

public class Main {

    public static int multiplyN(int number , int n){
        int resultValue = 1;
        for(int multiplyCounter = 0; multiplyCounter < n; multiplyCounter ++){
            resultValue *=  number;
        }
        return resultValue;
    }

    public static int arithmeticRootNDegree(int number , int n){
        int resultValue = 0;
        while (multiplyN(resultValue , n) != number){
            ++ resultValue;
        }
        return resultValue;
    }

    public static void main(String[] args) {
        int testValue = 64; // 64 / 4 / 4 = 4 (4 * 4 * 4 = 64)
        System.out.println(arithmeticRootNDegree(testValue , 3));
        // Checking of raising to the nth degree of number.
        System.out.println(multiplyN(4 , 3));
    }
}
