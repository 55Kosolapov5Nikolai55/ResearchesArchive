package com.company;

public class HashTableImpl<K,V> implements HashTableInter<K,V>{

    private Node<K,V>[] table;
    private int capacity = 16;
    private double threshold;
    private double loadFactor = 0.75d;
    private int size = 0;

    public HashTableImpl(){
        table = new Node[capacity];
        threshold = capacity * loadFactor;
    }

    public HashTableImpl(int capacity){
        this.capacity = capacity;
        table = new Node[capacity];
        threshold = capacity * loadFactor;
    }

    public HashTableImpl(int capacity , int loadFactor){
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        table = new Node[capacity];
        threshold = capacity * loadFactor;
    }

    public int hashFunction(K key){
        return key.hashCode() % capacity;
    }

    @Override
    public void put(K key, V value) {
        Node<K,V> addNode = new Node<>(key , value);
        int index = this.hashFunction(key);
        if(table[index] != null){
            if(table[index].key == key) {
                table[index] = addNode;
                return;
            }
                while (table[index].key == key){
                    index = index % capacity;
                }
        }
        table[index] = addNode;
        ++size;
    }

    @Override
    public V get(K key) {
        int index = this.hashFunction(key);
        if(table[index] != null){
            if(table[index].key != key){
                while (table[index].key != key){
                    index = index % capacity;
                }
                return table[index].value;
            }
            return table[index].value;
        }
        return null;
    }

    @Override
    public void remove(K key) {
        int index = this.hashFunction(key);
        if(table[index] != null){
            if(table[index].key != key){
                while (table[index].key != key){
                    index = index % capacity;
                }
                table[index] = null;
                --size;
                return;
            }
            table[index] = null;
            --size;
        }
    }

    @Override
    public boolean containsKey(K key) {
        int index = this.hashFunction(key);
        if(table[index] != null){
            if(table[index].key != key){
                while (table[index].key != key){
                    index = index % capacity;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for(int containsValueIndex = 0; containsValueIndex < table.length; containsValueIndex ++){
            if(table[containsValueIndex] != null) {
                if (table[containsValueIndex].value == value) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    public int getSize() {
        return size;
    }

    public class Node<K,V>{
        private K key;
        private V value;

        public Node(K key , V value){
            this.key = key;
            this.value = value;
        }
    }
}
