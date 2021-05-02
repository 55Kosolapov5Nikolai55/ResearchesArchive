package Kosolapov.Nikolai;

public class Main {

    // Triangle printing:

    public static void printTriangle(int n , String element){
        for(int printIndex = 0; printIndex < n; printIndex ++){
            for(int displayIndex = 0; displayIndex <= printIndex; displayIndex ++) {
                System.out.print(element);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        printTriangle(10 , "{}");
    }
}
   