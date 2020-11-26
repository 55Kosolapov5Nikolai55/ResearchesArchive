package com.KosolapovNikolai;

public class ArrayIteratorImpl<E> implements ArrayIteratorInter<E>{
    private Object[] elements; // Array of elements, which we want to iterate.
    private int index = -1; // Default index of iterator.
    private int length = 0; // Default length.

    public ArrayIteratorImpl(){
        elements = new Object[]{}; // Empty constructor - empty array.
    }

    public  ArrayIteratorImpl(E[] elements){
        this.elements = elements;
        this.length = elements.length;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < this.length; //Suppose, that current index = x  We have next element while x + 1.
    }

    @Override
    public E next() {
        if(this.hasNext()) { // If we have next element - we can return our it. <-------
            E nextElement = (E) this.elements[++this.index]; //                        |
            return nextElement; //                                                     |
        } //                                                                           |
        return null; // In other cases - return null. ----------------------------------
    }

    @Override
    public void remove() {
        for (int indexOfRemoving = 1; indexOfRemoving < this.length; indexOfRemoving++) {
            this.elements[indexOfRemoving - 1] = this.elements[indexOfRemoving]; // Index for removing starts at 1. While we are removing an element, last position is equal to index for removing.
        }
        this.elements[this.length - 1] = null; // Last element is null, because pre-last and last elements are equal.
        --this.length;
    }

    public void reset(){ // Return index to default value.
        this.index = -1;
    }

    public int getLength() {
        return length;
    }
}
