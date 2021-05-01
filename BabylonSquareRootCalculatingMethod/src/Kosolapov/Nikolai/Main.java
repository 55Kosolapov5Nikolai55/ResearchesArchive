package Kosolapov.Nikolai;

public class Main {


                                                           /*

                                 Babylon's method of calculating of arithmetic square root:

                                               √c =  √a² + √b ≈ a + b / 2a

                                                           */


    public static int calculateANumber(int C) {
        int arithmeticSquareRoot = 0;
        while (arithmeticSquareRoot * arithmeticSquareRoot != C) {
            if(arithmeticSquareRoot * arithmeticSquareRoot > C){
                break;
            }
            ++ arithmeticSquareRoot;
        }
        arithmeticSquareRoot--;
        return arithmeticSquareRoot;
    }

    public static double calculateArithmeticSquareRoot(int C) {
        int a = calculateANumber(C);
        int b = C - (a * a);
        return (a + (double) b / (2 * a));
    }


    public static void main(String[] args) {

        System.out.println("√265 ≈ " + calculateArithmeticSquareRoot(265));

        // Checking :
        System.out.println("16.28125² ≈ " + (int)(calculateArithmeticSquareRoot(265) * calculateArithmeticSquareRoot(265)));
    }
}
