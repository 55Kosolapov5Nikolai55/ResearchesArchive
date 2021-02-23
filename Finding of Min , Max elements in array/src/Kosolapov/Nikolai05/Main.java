package Kosolapov.Nikolai05;

public class Main {

    public static void findMinNumberInArray(int[] numbers){
        int minValue = numbers[0];
        int minIndex = 0;
        for(int minFindIndex = 1; minFindIndex < numbers.length; minFindIndex ++){
            if(minValue > numbers[minFindIndex]){
                minIndex = minFindIndex;
                minValue = numbers[minFindIndex];
            }
        }
        System.out.println("Min element: " + minValue);
        System.out.println("Min elements' index: " + minIndex);
    }

    public static void findMaxNumberInArray(int [] numbers){
        int maxValue = numbers[0];
        int maxIndex = 0;
        for(int maxFindIndex = 1; maxFindIndex < numbers.length; maxFindIndex ++){
            if(maxValue < numbers[maxFindIndex]){
                maxIndex = maxFindIndex;
                maxValue = numbers[maxFindIndex];
            }
        }
        System.out.println("Max element: " + maxValue);
        System.out.println("Max elements' index: " + maxIndex);
    }

    public static void main(String[] args) {
        int[] testNumbers = {34 , -12 , 434 , 555 , 4342 , -99 , -23};
        findMinNumberInArray(testNumbers);
        System.out.println("_______________________________________");
        findMaxNumberInArray(testNumbers);
    }
}