package com.KosolapovNikolai;




public class Main {

    public static boolean checkingElementsForUniqueness(Object[] objects) {
        for(int currentIndex = 0; currentIndex < objects.length - 1; currentIndex ++){
            for(int checkIndex = currentIndex + 1; checkIndex < objects.length; checkIndex ++){
                if(objects[currentIndex] == objects[checkIndex]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {


            String[] elementsArray = {"Element", "String", "."}; // Array of unique elements.
            System.out.println(checkingElementsForUniqueness(elementsArray));

            System.out.println("------------------------------------------");

            String[] elementsArray1 = {"." , "Element", "String", "."}; // Array of elements (not unique).
            System.out.println(checkingElementsForUniqueness(elementsArray1));

            System.out.println("------------------------------------------");

            String[] elementsArray2 = {""};
            System.out.println(checkingElementsForUniqueness(elementsArray2)); // Array with 1 element.

            System.out.println("------------------------------------------");

            String[] elementsArray3 = {};
            System.out.println(checkingElementsForUniqueness(elementsArray3)); //Empty array.

        }
    }
