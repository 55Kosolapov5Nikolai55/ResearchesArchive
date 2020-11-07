package com.KosolapovNikolai;


import java.util.Arrays;

public class Main {

    public static double[] solveTheQuadraticEquation(double a , double b , double c) { // Quadratic equation: ax² + bx + c = 0
        double discriminant = (b * b) - 4 * (a * c); // D = b² - 4ac
        double x1;
        double x2;
        double[] roots = {};

        if (discriminant > 0) { // If discriminant > 0 => 2 roots.
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots = new double[]{x1 , x2};

        } else if (discriminant == 0) { // If discriminant == 0 => 2 equal roots. <--------------|
            x1 = -b / (2 * a); //                                                                |
            roots = new double[]{x1}; // We don't need to add second root to array of results. ---
        }

        // If discriminant < 0 => 0 roots.

        return roots;
    }

    public static void displayArray(double[] arr){ // Method for array's displaying
        for(int indexForDisplay = 0; indexForDisplay < arr.length; indexForDisplay ++){
            System.out.println(arr[indexForDisplay] + " ; ");
        }
    }

    public static void main(String[] args) {

        double[] roots = solveTheQuadraticEquation(4 , -3 , -1); // 2 roots
        displayArray(roots);

        System.out.println("----------------------------------------");

        double[] roots1 = solveTheQuadraticEquation(16 , -40 , 25); // 1 roots
        displayArray(roots1);

        System.out.println("----------------------------------------");

        double[] roots2 = solveTheQuadraticEquation(1 , -1 , 4); // 0 roots
        displayArray(roots2);

    }
}
