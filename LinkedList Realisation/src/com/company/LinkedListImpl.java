package com.company;

import java.util.Iterator;

public class LinkedListImpl<V> implements LinkedListInter<V>, Iterable<V> {

    private Item head, tail;
    private int length = 0;

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            Item currentItem = head;

            @Override
            public boolean hasNext() {
                return currentItem != null;
            }

            @Override
            public V next() {
                V resultValue = currentItem.value;
                currentItem = currentItem.next;
                return resultValue;
            }
        };
    }

    public class Item {
        private V value;
        private Item next;

        public Item(V value) {
            this.value = value;
        }
    }

    @Override
    public void add(V value) {
        Item newItem = new Item(value);
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
            ++length;
            return;
        }
        tail.next = newItem;
        tail = newItem;
        ++length;
    }

    @Override
    public void set(V oldValue, V value) {
        if (isEmpty()) {
            return;
        }
        if (head.value == oldValue) {
            head.value = value;
            return;
        }
        Item currentItem = head;
        while (currentItem.next != value) {
            currentItem = currentItem.next;
            if (currentItem.value == oldValue) {
                currentItem.value = value;
                return;
            }
        }
    }

    @Override
    public void remove(V value) {
        if (isEmpty()) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            --length;
            return;
        }
        Item currentItem = head;
        while (currentItem.next != null) {
            if (currentItem.next.value == value) {
                currentItem.next = currentItem.next.next;
                --length;
                return;
            }
            currentItem = currentItem.next;
        }
    }

    @Override
    public void reverse(V value) {
        
    }

    @Override
    public void add(int index, V value) {
        if (isEmpty()) {
            return;
        }
        if (index == 0) {
            Item newHead = new Item(value);
            newHead.next = head;
            head = newHead;
            ++length;
            return;
        }
        int currentIndex = 0;
        Item currentItem = head;
        while (currentItem.next != null) {
            currentItem = currentItem.next;
            currentIndex++;
            if (currentIndex == index) {
                Item newItem = new Item(value);
                currentItem.next = newItem;
                newItem.next = currentItem.next.next;
                ++length;
                return;
            }
        }
    }

    @Override
    public void set(int index, V value) {
        if (index == 0) {
            head.value = value;
            return;
        }
        int currentIndex = 0;
        Item currentItem = head;
        while (currentItem.next != null) {
            currentItem = currentItem.next;
            currentIndex++;
            if (currentIndex == index) {
                currentItem.value = value;
                return;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            return;
        }
        if (index == 0) {
            head = head.next;
            --length;
            return;
        }
        int currentIndex = 1;
        Item currentItem = head;
        while (currentItem.next != null) {
            if (currentIndex == index) {
                currentItem.next = currentItem.next.next;
                --length;
                return;
            }
            currentItem = currentItem.next;
            currentIndex = currentIndex + 1;
        }
    }

    @Override
    public V get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index == 0) {
            return head.value;
        }
        int currentIndex = 0;
        Item currentItem = head;
        while (currentItem.next != null) {
            currentItem = currentItem.next;
            currentIndex++;
            if (currentIndex == index) {
                return currentItem.value;
            }
        }
        return null;
    }

    @Override
    public void reverseIndex(int index) {

    }

    @Override
    public void displayAll() {
        Iterator<V> displayIterator = this.iterator();
        while (displayIterator.hasNext()) {
            System.out.println(displayIterator.next());
        }
    }

    @Override
    public void reverse() {
       if(!isEmpty() && head.next != null){
           tail = head;
           Item current = head.next;
           head.next = null;
           while (current != null){
               Item next = current.next;
               current.next = head;
               head = current;
               current = next;
           }
       }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public int getLength() {
        return length;
    }
}
