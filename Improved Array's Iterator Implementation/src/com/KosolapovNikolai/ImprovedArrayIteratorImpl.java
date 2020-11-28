package com.KosolapovNikolai;

public class ImprovedArrayIteratorImpl<E> implements ImprovedArrayIteratorInter<E>{
    private Object[] elements; // Array of elements, which we want to iterate.
    private int index = -1; // Default index of iterator.
    private int length = 0; // Default length.

    public ImprovedArrayIteratorImpl() {
        elements = new Object[]{}; // Empty constructor - empty array.
    }

    public ImprovedArrayIteratorImpl(E[] elements) {
        this.elements = elements;
        this.length = elements.length;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < this.length ; //Suppose, that current index = x  We have next element while x + 1 < elements.
    }

    @Override
    public E next() {

        return (E) this.elements[++ this.index];
    }

    @Override
    public void remove() {
        for (int indexOfRemoving = this.index; indexOfRemoving + 1 < this.length; indexOfRemoving ++) {
            this.elements[indexOfRemoving] = this.elements[indexOfRemoving + 1]; // Index for removing starts at 1. While we are removing an element, last position is equal to index for removing.
        }
        this.elements[this.length - 1] = null; // Last element is null, because pre-last and last elements are equal.
        -- this.length;
        -- this.index; // After removing, if we want to use next(), we will get an element, which is on after-next position of removing element. But if we decrease current index by one - we solve this problem.
    }

    @Override
    public boolean hasPrevious() {
        return this.index - 1 >= -1;
    }

    @Override
    public E previous() {
        int prevIndex = this.index --;
        return (E) this.elements[prevIndex];
    }

    @Override
    public void add(E element) {
        Object[] newElements = new Object[this.length + 1];
        for(int copyIndex = 0; copyIndex < newElements.length; copyIndex ++){
            newElements[copyIndex] = this.elements[copyIndex];
        }
        for(int indexForAdding = this.index; indexForAdding + 1 < newElements.length; indexForAdding ++){
            newElements[indexForAdding + 1] = this.elements[indexForAdding];
        }
        this.elements = newElements;
        ++ this.length;
        this.set(element);
    }

    @Override
    public void set(E element) {
        int indexSet = ++ this.index;
        this.elements[indexSet] = element;
    }

    public void reset(){ // Return index to default value.
        this.index = -1;
    }

    public int getLength() {
        return length;
    }
}
