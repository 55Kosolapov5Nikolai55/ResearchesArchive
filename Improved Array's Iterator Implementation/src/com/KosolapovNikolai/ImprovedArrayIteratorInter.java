package com.KosolapovNikolai;

public interface ImprovedArrayIteratorInter<E> {
    boolean hasNext();
    E next();
    void remove();
    boolean hasPrevious();
    E previous();
    void add(E element);
    void set(E element);
}
