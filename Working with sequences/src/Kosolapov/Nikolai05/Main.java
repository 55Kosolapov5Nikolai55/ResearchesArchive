package Kosolapov.Nikolai05;

public class Main {

    public static double findElement(int elementNumber , double a1 , double d) {
        return a1 + (elementNumber - 1) * d;
    }

    public static double findSumOfElements(double startElement , double endElement , int n){
        return (startElement + endElement) / 2 * n;
    }

    public static double findDUsingElements(double currentElement , double nextElement){
        return nextElement - currentElement;
    }

    public static double findDUsingArray(double[] elements){
        return elements[1] - elements[0];
    }

    public static void createRecurrentFunctionUsingElements(double currentElement , double nextElement){
        System.out.println("aₙ₊₁ = aₙ + (" + findDUsingElements(currentElement , nextElement) + ")");
    }

    public static void createRecurrentFunctionUsingArray(double[] elementsArray){
        System.out.println("aₙ₊₁ = aₙ + (" + findDUsingArray(elementsArray)+ ")");
    }

    public static void main(String[] args) {
        double[] testElements = {2 , 4 , 6 , 8 , 10};
        System.out.println(findDUsingArray(testElements));
        System.out.println(findElement(5 , 2 , findDUsingArray(testElements)));
        System.out.println(findSumOfElements(2 , 6 , 3));
        createRecurrentFunctionUsingArray(testElements);
        System.out.println("_________________________");
        double testElement = 0.33d;
        double testElement1 = 0.02d;
        System.out.println(findDUsingElements(testElement , testElement1));
        System.out.println(findElement(2 , testElement , findDUsingElements(testElement , testElement1)));
        System.out.println(findSumOfElements(testElement , testElement1 , 2));
        createRecurrentFunctionUsingElements(testElement , testElement1);
    }
}
