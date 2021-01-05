package com.company;

public class Main {

    public static void main(String[] args) {

        HashTableImpl<Integer , Integer> myHashTable = new HashTableImpl<>();
        myHashTable.put(12 , 109);
        myHashTable.put(32 , 287);
        System.out.println(myHashTable.getSize());
        System.out.println("___________________");
        myHashTable.put(12 , 523);
        myHashTable.put(32 , 123);
        System.out.println(myHashTable.getSize());
        System.out.println("___________________");
        myHashTable.remove(12);
        System.out.println(myHashTable.get(12));
        System.out.println("___________________");
        System.out.println(myHashTable.get(32));
        System.out.println("___________________");
        System.out.println(myHashTable.containsKey(32));
        System.out.println("___________________");
        System.out.println(myHashTable.containsValue(123));
        System.out.println("___________________");
        System.out.println(myHashTable.containsKey(90));
        System.out.println("___________________");
        System.out.println(myHashTable.containsValue(767));
        System.out.println("___________________");
        myHashTable.remove(32);
        System.out.println(myHashTable.isEmpty());

    }
}
