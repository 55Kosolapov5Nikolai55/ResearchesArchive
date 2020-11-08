package com.KosolapovNikolai;




public class Main {

    public static boolean checkingElementsForUniqueness(Object[] objects){
        Object currentElement;
        for(int checkIndex = 1; checkIndex < objects.length; checkIndex++){
            currentElement = objects[checkIndex];
            if(currentElement == objects[checkIndex - 1]){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] elementsArray = {"Element" , "String" , "."}; // Array of unique elements.
        System.out.println(checkingElementsForUniqueness(elementsArray));

        System.out.println("------------------------------------------");

        String[] elementsArray1 = {"Element" , "String" , "." , "."}; // Array of elements (not unique).
        System.out.println(checkingElementsForUniqueness(elementsArray1));

        System.out.println("------------------------------------------");

        String[] elementsArray2 = {""};
        System.out.println(checkingElementsForUniqueness(elementsArray2)); // Array with 1 element.

        System.out.println("------------------------------------------");

        String[] elementsArray3 = {};
        System.out.println(checkingElementsForUniqueness(elementsArray3)); //Empty array.


    }
}
