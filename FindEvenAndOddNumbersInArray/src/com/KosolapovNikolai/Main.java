package com.KosolapovNikolai;


public class Main {

    public static void findEvenNumbers(Number[] numbers){
        for(int findLoopIndex = 0; findLoopIndex < numbers.length; findLoopIndex ++){
            double currentElement = numbers[findLoopIndex].doubleValue();
            if(currentElement % 2 == 0){
                System.out.println(currentElement);
            }
        }
        System.out.println("___________________");
    }

    public static void findOddNumbers(Number[] numbers){
        for(int findLoopIndex = 0; findLoopIndex < numbers.length; findLoopIndex ++){
            double currentElement = numbers[findLoopIndex].doubleValue();
            if(currentElement % 2 == 1){
                System.out.println(currentElement);
            }
        }
        System.out.println("___________________");
    }

    public static void main(String[] args) {
        Number[] numbers = {13 , 23 , 354, 565, 443, 45 , 2 , 23 , 22 , 10};
        findEvenNumbers(numbers);
        findOddNumbers(numbers);
    }
}


