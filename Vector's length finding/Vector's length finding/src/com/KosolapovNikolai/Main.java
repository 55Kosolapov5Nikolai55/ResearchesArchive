package com.KosolapovNikolai;


public class Main {

    // Vector's length finding algorithm.
    //                            ->
    //Vector's length : A(x;y) B(x1;y2) , |AB| = √((x1 - x)²;(y1 - y)²).

    public static double findVectorLength(int x , int y , int x1 , int y1){
        int xValue = x1 - x;
        int yValue = y1 - y;
        double length = Math.sqrt((xValue * xValue) + (yValue * yValue));
        return length;
    }

    public static void main(String[] args) {

        // Test:
        //Coordinates of A

        int Ax = 0;
        int Ay = 0;

        //Coordinates of B
        int Bx = 12;
        int By = 3;

        double ABLength = findVectorLength(Ax , Ay , Bx , By);
        System.out.println(ABLength);


    }
}
