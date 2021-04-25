package com.company;

import java.util.Iterator;

public interface LinkedListInter<V> {
    // Non - Random access methods:
    void add(V value);
    void set(V oldValue , V value);
    void remove(V value);
    void reverse(V value);
    // Random access methods:
    void add(int index , V value);
    void set(int index , V value);
    void remove(int index);
    V get(int index);
    void reverseIndex(int index);
    // Other:
    void displayAll();
    void reverse();
    boolean isEmpty();
}
