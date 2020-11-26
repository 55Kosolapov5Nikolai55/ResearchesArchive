package com.KosolapovNikolai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ArrayIterator Test:
        Integer[] ages = new Integer[]{10 , 23 , 34 , 90 , 24};
        ArrayIteratorImpl<Integer> agesIterator = new ArrayIteratorImpl<>(ages);
        agesIterator.next();
        agesIterator.remove1();
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next());
        }
        System.out.println("Length: " + agesIterator.getLength());
        System.out.println("Before reset:");
        System.out.println("Has next? " + agesIterator.hasNext());
        agesIterator.reset();
        System.out.println("After reset:");
        System.out.println("Has next? " + agesIterator.hasNext());

    }
}


