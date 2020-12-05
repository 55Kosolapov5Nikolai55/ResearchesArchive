package com.KosolapovNikolai;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // LinkedList Implementation Test:
        LinkedListImpl<String> charLinkedL = new LinkedListImpl<>();
        charLinkedL.add("John");
        charLinkedL.add("Ricardo");
        charLinkedL.add("Nikolai");

        for(String stringDisplay : charLinkedL){
         System.out.println(stringDisplay);
        }

        System.out.println("_________________________");

        charLinkedL.remove("Nikolai");
        charLinkedL.set("John" , "Tetta");
        for(String stringDisplay : charLinkedL){
            System.out.println(stringDisplay);
        }
        System.out.println("_________________________");
        charLinkedL.set("Ricardo" , "Giovanni");
        Iterator<String> strIter = charLinkedL.iterator();
        while (strIter.hasNext()){
            System.out.println(strIter.next());
        }
    }
}


