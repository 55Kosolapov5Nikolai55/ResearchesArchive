package Kosolapov.Nikolai05;

public class Main {

    public static void calculateAngle(int angle){ // angle = a + 360 * n , n - number of full turnovers.
        System.out.println(angle + " is " + (angle % 360) + " + " + ("360 * " + (angle / 360)));
    }

    public static void main(String[] args) {
        calculateAngle(3453);
        calculateAngle(-2323);
    }
}