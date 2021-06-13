package Kosolapov.Nikolai;


public class Main {


    public static int[][] getPascalTriangle(int n) {
        int[][] triangle = new int[n][n];
        triangle[0][0] = 1;
        for (int fillFL = 1; fillFL < n; fillFL++) {
            triangle[fillFL][0] = 1;
            triangle[fillFL][n - 1] = 1;
        }
        for (int fillV = 1; fillV < n; fillV++) {
            for (int fillH = 1; fillH < n; fillH++) {
                triangle[fillV][fillH] = triangle[fillV - 1][fillH - 1] + triangle[fillV - 1][fillH];
            }
        }
        return triangle;
    }

    public static void displaySerpinskiyTriangle(int [][] triangle) {
        for (int displayHorizontal = 0; displayHorizontal < triangle.length; displayHorizontal++) {
            for (int displayVertical = 0; displayVertical < triangle[displayHorizontal].length; displayVertical++) {
                if (triangle[displayHorizontal][displayVertical] != 0) {
                    if(triangle[displayHorizontal][displayVertical] % 2 == 0){
                        System.out.print("\u001B[33m" + triangle[displayHorizontal][displayVertical] + " ");
                    }else {
                        System.out.print("\u001B[34m" + triangle[displayHorizontal][displayVertical] + " ");

                    }
                }
                if(displayVertical == triangle[displayHorizontal].length - 1){
                    System.out.println("");
                }
            }
        }
    }


   /* public static void displayIsoscelesTriangle(String element , int n) {
            for (int displayLine = 0; displayLine < n; displayLine++) {
                for (int displayElements = 0; displayElements <= displayLine; displayElements++) {
                    System.out.print(element);
                }
                System.out.println();
        }
    }
*/
    public static void main(String[] args) {

        displaySerpinskiyTriangle(getPascalTriangle(15));

        //displayIsoscelesTriangle("v" , 5);

    }
}