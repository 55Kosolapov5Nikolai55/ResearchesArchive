package Kosolapov.Nikolai05;
import java.util.Scanner;

public class Main {

    public static void play(){
        String [][] playSpace = {{"_ " , "_ " , "_ "} , {"_ " , "_ " , "_ "} , {"_ " , "_ " , "_ "}};
        displayPlaySpace(playSpace);
        int motionCounter = 0;
        while (motionCounter <= 9){
            Scanner motionScannerX = new Scanner(System.in);
            Scanner motionScannerY = new Scanner(System.in);
            int x = motionScannerX.nextInt();
            int y = motionScannerY.nextInt();
            if(x <= 3 && y <= 3 && playSpace[x - 1][y - 1].equals("_ ")) {
                if (motionCounter % 2 == 1) {
                    playSpace[x - 1][y - 1] = "◯";
                } else {
                    playSpace[x - 1][y - 1] = "╳";
                }
                ++motionCounter;
                displayPlaySpace(playSpace);
                victory(playSpace);
            }
        }
    }

    public static void victory(String [][] playSpace) {
        // Horizontal Check :
        for(int line = 0; line < playSpace.length; line ++){
            if (playSpace[line][0].equals(playSpace[line][1]) && playSpace[line][1].equals(playSpace[line][2]) && !playSpace[line][0].equals("_ ")) {
                System.out.println(playSpace[line][0] + " won!");
            }
        }
        // Vertical Check :
        for (int row = 0; row < playSpace.length; row++) {
            if (playSpace[0][row].equals(playSpace[1][row]) && playSpace[1][row].equals(playSpace[2][row]) && !playSpace[0][row].equals("_ ")) {
                System.out.println(playSpace[0][row] + " won!");
            }
        }
        // Diagonals Check :
        if(playSpace[0][0].equals(playSpace[1][1]) && playSpace[1][1].equals(playSpace[2][2]) && !playSpace[1][1].equals("_ ")){
            System.out.println(playSpace[0][0] + " won!");
        }
        if(playSpace[0][2].equals(playSpace[1][1]) && playSpace[1][1].equals(playSpace[2][0]) && !playSpace[1][1].equals("_ ")){
            System.out.println(playSpace[1][1] + " won!");
        }
    }

    public static void displayPlaySpace(String [][] playSpace){
        for(int displayRow = 0; displayRow < playSpace.length; displayRow ++){
            for(int displayLine = 0; displayLine < playSpace[displayRow].length; displayLine ++){
                System.out.print(playSpace[displayRow][displayLine] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        play();
    }
}