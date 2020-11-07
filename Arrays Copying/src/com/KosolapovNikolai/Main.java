package com.KosolapovNikolai;


public class Main {

    public static Object[] copyArray(Object[] arr){
        Object[] copy = new Object[arr.length];
        for(int indexCopy = 0; indexCopy < arr.length; indexCopy ++){ // Copy all elements from specified array to copy.
            copy[indexCopy] = arr[indexCopy]; // Current index's slot in copy array is equal to itself in specified array.
        }
        return copy;
    }

    public static Object[] copyArrayWithException(Object [] arr , int exceptionIndex){ // Copy all elements except element at specified slot.
        Object[] copy = new Object[arr.length]; // Or ... = new Object[arr.length - 1] if you don't want to get null in copy (see last comment of this method).
        for(int i = 0; i < arr.length; i ++){
            if(i < exceptionIndex ){copy[i] = arr[i];} // Current index's slot in copy array is equal to itself in specified array.
            else if(i == exceptionIndex){copy[i] = arr[i + 1];} // Current index's slot in copy array is equal to next index in specified array.
            else if(i > exceptionIndex){copy[i - 1] = arr[i];} // Previous current's index's slot in copy array is equal to index in specified array.
        }
        return copy; // In copy will be an empty slot (null). We can use copy, which length is less by one. In this case won't be a null.
    }

    public static void displayArray(Object[] arr){ // Method for array's displaying
        for(int indexForDisplay = 0; indexForDisplay < arr.length; indexForDisplay ++){
            System.out.println(arr[indexForDisplay] + " ; ");
        }
    }

    public static void main(String[] args) {

        Object[] names = {"John" , "Adolf" , "Margaret" , "Napoleon"};

        Object[] namesCopy = copyArray(names);
        displayArray(namesCopy);

        System.out.println("----------------------------------------");

        Object[] namesCopyWithException = copyArrayWithException(names , 1);
        displayArray(namesCopyWithException);
    }
}
