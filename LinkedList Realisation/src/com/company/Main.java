package com.company;


public class Main {

    public static void main(String[] args) {

        // LinkedList Implementation Test:
        LinkedListImpl<String> charLinkedL = new LinkedListImpl<>();
        System.out.println(charLinkedL.isEmpty());
        System.out.println("_____________________");
        charLinkedL.add("A");
        charLinkedL.add("B");
        charLinkedL.add(0 , "C");
        charLinkedL.set(2 , "W");
        charLinkedL.set(1 , "O");
        charLinkedL.remove(1);
        charLinkedL.add("33");
        charLinkedL.remove("W");
        charLinkedL.remove("C");
        charLinkedL.remove("33");
        System.out.println(charLinkedL.get(0)); // Output: null (Our LinkedList is empty).
        System.out.println("_____________________");
        charLinkedL.add("L");
        charLinkedL.add("O");
        charLinkedL.add("O");
        charLinkedL.add("L");
        charLinkedL.set(0 , "E");
        charLinkedL.set(1 , "V");
        System.out.println(charLinkedL.get(3));
        System.out.println("_____________________");
        charLinkedL.set(2 , "I");
        charLinkedL.displayAll();
        System.out.println("_____________________");
        charLinkedL.set("I" , "O");
        charLinkedL.reverse();
        charLinkedL.displayAll();
        System.out.println("_____________________");
        System.out.println(charLinkedL.isEmpty());
        System.out.println("_____________________");
        System.out.println(charLinkedL.getLength());
        System.out.println("_____________________");
        charLinkedL.reverse();
        for(String displayS : charLinkedL){
            System.out.println(displayS);
        }
        System.out.println("_____________________");
        charLinkedL.reverse("O");
        for(String displayS : charLinkedL){
            System.out.println(displayS);
        }
    }
}
