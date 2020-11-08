package com.KosolapovNikolai;




public class Main {

    public static void printFromInterval(int[] arr , int start , int stop){
       for(int intervalCheckIndex = 0; intervalCheckIndex < arr.length; intervalCheckIndex++){
           if(start < arr[intervalCheckIndex] && arr[intervalCheckIndex] < stop){
               System.out.println(arr[intervalCheckIndex]);
           }
       }
    }

    public static void main(String[] args) {

        int[] numbers = {1 , 1 , 2 , 3 , 5 , 8 , 13 , 21};
        printFromInterval(numbers , 4 , 7);

        System.out.println("---------------------");

        printFromInterval(numbers , 13 , 21); // Empty output
    }
}
