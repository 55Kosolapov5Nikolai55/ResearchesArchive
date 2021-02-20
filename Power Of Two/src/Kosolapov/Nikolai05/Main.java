package Kosolapov.Nikolai05;

public class Main {

    public static boolean powerOfTwo(int numberToCheck){
        int resultValue = 1;
        while (resultValue < numberToCheck){
            resultValue = resultValue * 2;
        }
        return resultValue == numberToCheck;
    }

    public static void main(String[] args) {
        int testValue = 191;
        System.out.println(powerOfTwo(testValue));
        int testValue1 = 256;
        System.out.println(powerOfTwo(testValue1));
    }
}
