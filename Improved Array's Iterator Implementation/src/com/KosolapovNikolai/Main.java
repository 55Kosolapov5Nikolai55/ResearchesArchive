package com.KosolapovNikolai;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // ArrayIterator Test:
        Integer[] ages = new Integer[]{10, 23, 34, 90, 24};
        ImprovedArrayIteratorImpl<Integer> agesIterator = new ImprovedArrayIteratorImpl<>(ages);
        agesIterator.next();
        agesIterator.next();
        agesIterator.next();
        agesIterator.remove();
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next()); // Empty input, because next element is null.
        }
        System.out.println("Length: " + agesIterator.getLength());
        System.out.println("Before reset:");
        System.out.println("Has next? " + agesIterator.hasNext());
        agesIterator.reset();
        System.out.println("After reset:");
        System.out.println("Has next? " + agesIterator.hasNext());
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next());
        }
        System.out.println("-----------");
        while (agesIterator.hasPrevious()){
            System.out.println(agesIterator.previous());
        }
        System.out.println("-----------");
        agesIterator.set(12);
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next());
        }
        System.out.println("-----------");
        agesIterator.reset();
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next());
        }
        System.out.println("-----------");
        agesIterator.reset();
        agesIterator.next();
        agesIterator.add(45);
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next());
        }
        System.out.println("-----------");
        agesIterator.reset();
        while (agesIterator.hasNext()) {
            System.out.println(agesIterator.next());
        }
    }
}


