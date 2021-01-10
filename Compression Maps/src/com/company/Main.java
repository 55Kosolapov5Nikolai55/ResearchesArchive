package com.company;

public class Main {

    public static int compressingL(Integer key , int n){
        int index = key % n;
        if(index < 0){
            return -index;
        }
        return index;
    }

    public static int compressingA(Integer key , double A , int n){
        int index = (int) (n * (key * A) % 1);
        if(index < 0){
            return -index;
        }
        return index;
    }

    public static int compressingFibonacci(Integer key , int n){
        double A = (Math.sqrt(5) - 1) / 2;
        int index = (int) (n * (key * A) % 1);
        return index;
    }

    public static int compressingMAD(Integer key ,int a , int b ,int n){ // a,n - co-prime.
        int index = (a * key + b) % n;
        if(index < 1) {
            return -index;
        }
        return index;
    }

    public static void main(String[] args) {

        // 1) Create 4 simple tables for 4 examples. We will use integers as keys and strings as values:
        int n = 14;
        String[] values = new String[n]; // Prime number as length of tables.
        String[] values1 = new String[n];
        String[] values2 = new String[n];
        String[] values3 = new String[n];

        // Example 1: Compressing using length of table:
        values[compressingL(242 , n)] = "Compressing using length of table.";
        System.out.println(values[compressingL(242 , n)]);
        // Example 2: Compressing using A constant:
        values1[compressingA(891 , 0.65 , n)] = "Compressing using A constant.";
        System.out.println(values1[compressingA(891 , 0.65 ,n)]);
        // Example 3: Fibonacci's compressing:
        values2[compressingFibonacci(3131 , n)] = "Fibonacci's compressing.";
        System.out.println(values2[compressingFibonacci(3131 , n)]);
        // Example 4: Multiply And Divide compression:
        values3[compressingMAD(888 , 9 , 5 ,n)] = "Multiply And Divide compression.";
        System.out.println(values3[compressingMAD(888 , 9 , 5 ,n)]);
    }
}