package com.KosolapovNikolai;

public class Main {

    public static void main(String[] args) {
        // ArrayIterator Test:
        Integer[] ages = new Integer[]{10 , 23 , 34 , 90 , 24};
        ArrayIteratorImpl<Integer> agesIterator = new ArrayIteratorImpl<>(ages);
        agesIterator.next();
        agesIterator.next();
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
    }
}


