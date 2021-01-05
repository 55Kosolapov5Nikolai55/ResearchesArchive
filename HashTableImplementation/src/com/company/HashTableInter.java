package com.company;

public interface HashTableInter<K,V> {
    void put(K key , V value);
    V get(K key);
    void remove(K key);
    boolean containsKey(K key);
    boolean containsValue(V value);
    boolean isEmpty();
}
