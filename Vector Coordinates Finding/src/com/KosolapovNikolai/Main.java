package com.KosolapovNikolai;

public class Main {

    public static double[] findACoordinates(double Bx , double By , double ABx , double ABy){
        double[] coordinatesA = {Bx - ABx , By - ABy};
        return coordinatesA;
    }

    public static double[] findBCoordinates(double Ax , double Ay , double ABx , double ABy){
        double[] coordinatesB = {ABx + Ax , ABy + Ay};
        return coordinatesB;
    }

    public static double[] findABCoordinates(double Ax , double Ay , double Bx , double By){
        double[] coordinatesAB = {Bx - Ax , By - Ay};
        return coordinatesAB;
    }

    public static void displayCoordinates(double[] coordinates){
        System.out.println("{" + coordinates[0] + ";" + coordinates[1] + "}");
    }

    public static void main(String[] args) {

        double[] A = findACoordinates(612 , 823 , 578 , 741);
        displayCoordinates(A);

        System.out.println("---------------------------------------------");

        double[] B = findBCoordinates(34 , 82 , 578 , 741);
        displayCoordinates(B);

        System.out.println("---------------------------------------------");

        double[] AB = findABCoordinates(34 , 82 , 612 , 823);
        displayCoordinates(AB);



    }
}
