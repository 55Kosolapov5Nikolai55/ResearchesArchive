package com.KosolapovNikolai;

public class Main {

    public static double findAverageValue(int[] numbers){
        int valuesQuantity = numbers.length;
        double valuesSum = 0;
        for(int indexSum = 0; indexSum < numbers.length; indexSum++){
            valuesSum += numbers[indexSum];
        }
        double averageValue = valuesSum / valuesQuantity;
        return averageValue;
    }

    public static void main(String[] args){
        // Find average value from numeric array

        int[] ages = {13 , 23 , 42, 54 , 45 , 93};
        System.out.println(findAverageValue(ages));

    }
}
