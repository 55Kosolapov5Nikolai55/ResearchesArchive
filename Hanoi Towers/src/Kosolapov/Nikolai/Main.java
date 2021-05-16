package Kosolapov.Nikolai;


public class Main {


    //                                       Hanoi Towers:

    //          _____________      |               |              |
    // pyramid |              |---------|          |              |
    //   of    |            |-------------|        |              |
   //n-1 height|_________ |-----------------|      |              |
    //        nth disk  |---------------------|    |              |
    //                 ---------------------------------------------------


    public static void transfer(int towerHeight, int from, int to) {
        if (from >= 1 && from <= 3 && to >= 1 && to <= 3) {
            if (from == to) {
                System.out.println("All disks remain in their place.");
                return;
            }
            if (towerHeight == 1) {
                System.out.println("Move disk 1 from " + from + " to " + to + ".");
            } else {
                int t = 6 - from - to;
                transfer(towerHeight - 1, from, t);
                System.out.println("Move disk " + towerHeight + " from " + from + " to " + to + ".");
                transfer(towerHeight - 1, t, to);
            }
        } else {
            System.out.println("Incorrect numbers of kernels.");
        }
    }

    public static void main(String[] args) {
        transfer(4 , 2 , 3);
    }
}
