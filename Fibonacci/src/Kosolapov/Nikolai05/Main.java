package Kosolapov.Nikolai05;



public class Main {

    public static int getFibonacciValueByNumber(int number){
        int FibonacciValue = 0;
        int old = 0;
        int step = 0;
        if(number == 2){
            return 1;
        }
        for(int getF = 1; getF < number - 1; getF ++){
            if(getF == 1){
                step = 1;
            }
            FibonacciValue = old + step;
            old = step;
            step = FibonacciValue;
        }
        return FibonacciValue;
    }

    public static void displayFibonacci(int n){
        for(int display = 1; display <= n; display ++){
            System.out.print(getFibonacciValueByNumber(display) + " ; ");
        }
    }

    public static void displayFibonacciFromKToJ(int k , int j){
        if(k < j){
            for(int displayKJ = k; displayKJ <= j; displayKJ ++){
                System.out.print(getFibonacciValueByNumber(displayKJ) +  " ; ");
            }
        }
    }

    public static int getFibonacciNumberByValue(int FibonacciValue){
        int old = 0;
        int step = 1;
        int calcValue = 0;
        int resultNumber = 1;
        if(FibonacciValue == 0){
            return 1;
        }
        while (calcValue <= FibonacciValue){
            calcValue = old + step;
            old = step;
            step = calcValue;
            ++ resultNumber;
        }
        return resultNumber;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci's value: " + getFibonacciValueByNumber(9));
        System.out.println("Number: " + getFibonacciNumberByValue(21));
        displayFibonacci(9);
        System.out.println("\n");
        displayFibonacciFromKToJ(5 , 9);
    }
}