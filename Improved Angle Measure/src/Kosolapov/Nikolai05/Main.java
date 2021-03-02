package Kosolapov.Nikolai05;

public class Main {

    public static void calculateAngle(int angle){ // angle = a + 360 * n , n - number of full turnovers. (0 <= a₀ <= 360° )
        if(angle < 0){
            System.out.println(angle + " is " + (360 + (angle % 360) + "° + ")+ ("360° * " + ((angle / 360) - 1)));
        }else {
            System.out.println(angle + " is " + (angle % 360) + "° + " + ("360° * " + (angle / 360)));
        }
    }

    public static void main(String[] args) {
        calculateAngle(3453);
        calculateAngle(-2323);
    }
}