package com.KosolapovNikolai;


public class Main {

    public static void main(String[] args) {

        // ArrayList Class:
        ArrayListC<String> myTestArrList = new ArrayListC<>();
        myTestArrList.add("05052005");
        myTestArrList.add("13U");
        myTestArrList.add("112U");

        System.out.println("Capacity: " + myTestArrList.getCapacity());
        System.out.println("Size: " + myTestArrList.getSize());
        System.out.println("Value 1: " + myTestArrList.get(0));
        System.out.println("Value 2: " + myTestArrList.get(1));
        System.out.println("Value 3: " + myTestArrList.get(2));
        myTestArrList.deleteByIndex(1);
        myTestArrList.deleteByValue("13U");
        System.out.println("Capacity: " + myTestArrList.getCapacity());
        System.out.println("Size: " + myTestArrList.getSize());
        System.out.println("Value 1: " + myTestArrList.get(0));
        System.out.println("Value 2: " + myTestArrList.get(1));
        System.out.println("Value 3: " + myTestArrList.get(2)); // Returns null because value not exist in arraylist.

    }
}
