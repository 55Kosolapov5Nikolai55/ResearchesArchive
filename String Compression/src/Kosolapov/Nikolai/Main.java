package Kosolapov.Nikolai;



import java.util.LinkedList;

public class Main {

    public static void displayResults(LinkedList<Character> componentsResults , LinkedList<Integer> quantities){
        for(int displayResults = 0; displayResults < componentsResults.size(); displayResults ++){
            System.out.print(quantities.get(displayResults));
            System.out.print(componentsResults.get(displayResults) + " ; ");
        }
        System.out.println();
    }

    public static void compressString(String stringToCompress) {
        char[] components = stringToCompress.toCharArray();
        int equalComponentsQuantity = 1;
        LinkedList<Character> history = new LinkedList<>();
        LinkedList<Character> componentsResults = new LinkedList<>();
        LinkedList<Integer> quantities = new LinkedList<>();
        for(int currentIndex = 0; currentIndex < components.length; currentIndex ++){
            if(!history.contains(components[currentIndex])) {
                history.add(components[currentIndex]);
                for (int compareIndex = currentIndex + 1; compareIndex < components.length; compareIndex++) {
                    if (components[currentIndex] == components[compareIndex]) {
                        ++equalComponentsQuantity;
                    }
                }
                quantities.add(equalComponentsQuantity);
                componentsResults.add(components[currentIndex]);
                equalComponentsQuantity = 1;
            }
        }
        displayResults(componentsResults , quantities);
    }



    public static void main(String[] args) {

        compressString("asdfbbcaaa");
        compressString("^   "); // " " as a component
        compressString("ggggh");
        compressString("hgggg");
    }
}
   