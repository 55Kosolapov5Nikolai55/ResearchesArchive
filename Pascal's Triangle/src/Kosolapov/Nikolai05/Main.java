package Kosolapov.Nikolai05;

import java.util.Arrays;

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

    public static int[] getNRow(int n) {
        return getPascalTriangle(n)[n - 1];
    }

    public static int[][] getPascalTriangleFromKToJ(int k, int j) {
        int[][] triangle = new int[(j + 1) - k][j];
        if (j > k) {
            int getIndex = k;
            for (int fill = 0; fill < (j + 1) - k; fill ++) {
                triangle[fill] = getNRow(getIndex);
                getIndex ++;
            }
        }
        return triangle;
    }

    public static void displayTriangle(int [][] triangle) {
        for (int displayHorizontal = 0; displayHorizontal < triangle.length; displayHorizontal ++) {
            for (int displayVertical = 0; displayVertical < triangle[displayHorizontal].length; displayVertical ++) {
                if (triangle[displayHorizontal][displayVertical] != 0) {
                    System.out.print(triangle[displayHorizontal][displayVertical] + " ");
                }
                if(displayVertical == triangle[displayHorizontal].length - 1){
                    System.out.println("\n");
                }
            }
        }
    }

    public static void displayRevertedTriangle(int [][] triangle){
        for (int displayHorizontal = triangle.length - 1; displayHorizontal >= 0; displayHorizontal --) {
            for (int displayVertical = 0; displayVertical < triangle[displayHorizontal].length; displayVertical ++) {
                if (triangle[displayHorizontal][displayVertical] != 0) {
                    System.out.print(triangle[displayHorizontal][displayVertical] + " ");
                }
                if(displayVertical == triangle[displayHorizontal].length - 1){
                    System.out.println("\n");
                }
            }
        }
    }

    public static void displayRow(int[] row){
        for(int displayRowIndex = 0; displayRowIndex < row.length; displayRowIndex ++){
            if(row[displayRowIndex] != 0){
                System.out.print(row[displayRowIndex] + " ");
            }
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[][] testTriangle = getPascalTriangle(3);
        displayTriangle(testTriangle);
        System.out.println("_________________________");
        int[] testRow = getNRow(4);
        displayRow(testRow);
        System.out.println("_________________________");
        int[][] testKToJTriangle = getPascalTriangleFromKToJ(1 , 3);
        displayTriangle(testKToJTriangle);
        System.out.println("_________________________");
        displayRevertedTriangle(testTriangle);
    }
}