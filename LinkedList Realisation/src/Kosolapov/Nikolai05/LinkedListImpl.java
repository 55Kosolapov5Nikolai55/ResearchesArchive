package Kosolapov.Nikolai05;

import java.util.*;

public class LinkedListImpl<V> implements LinkedListInter<V> , Iterable<V> {

    private ListItem<V> head;
    private ListItem<V> tail;
    private int length = 0;

    protected static class ListItem<V> {
        V value;
        ListItem<V> nextListItem;

        public ListItem(V value) {
            this.value = value;
        }

    }

    @Override
    public void add(V value) {
        if (isEmpty()) {
            ListItem<V> newItem = new ListItem<V>(value);
            head = newItem;
            tail = newItem;
        } else {
            tail.nextListItem = new ListItem<V>(value);
            tail = tail.nextListItem;
        }
        ++ length;
    }

    @Override
    public void set(V oldValue, V newValue) {
        if (head.value == oldValue) {
            head.value = newValue;
        } else if (tail.value == oldValue) {
            tail.value = newValue;
        } else {
            ListItem<V> currentItem = head;
            while (currentItem.nextListItem != null) {
                if (currentItem.nextListItem.value == oldValue) {
                    currentItem.nextListItem.value = newValue;
                    return;
                }
                currentItem = currentItem.nextListItem;
            }
        }
    }

    @Override
    public void delete(V value) {
        if(head.value == value){
            head = head.nextListItem;
            -- length;
        }else {
            ListItem<V> currentListItem = head;
            while (currentListItem.nextListItem != null){
                if(currentListItem.nextListItem.value == value) {
                    currentListItem.nextListItem = currentListItem.nextListItem.nextListItem;
                    -- length;
                    return;
                }
                currentListItem = currentListItem.nextListItem;
            }
        }
    }

    @Override
    public void add(V value, int index) {
        if(index == 0){
            ListItem<V> newItem = new ListItem<>(value);
            newItem.nextListItem = head;
            head = newItem;
            ++ length;
        }else {
            ListItem<V> currentItem = head;
            int currentIndex = 0;
            while (currentItem.nextListItem != null){
                ++ currentIndex;
                if(currentIndex == index){
                    ListItem<V> newItem = new ListItem<>(value);
                    newItem.nextListItem = currentItem.nextListItem;
                    currentItem.nextListItem = newItem;
                    ++ length;
                    return;
                }
                currentItem = currentItem.nextListItem;
            }
        }
    }

    @Override
    public void setByIndex(V value, int index) {
        if(index == 0){
            head.value = value;
        }else {
            ListItem<V> currentItem = head;
            int currentIndex = 0;
            while (currentItem.nextListItem != null){
                ++ currentIndex;
                if(currentIndex == index){
                    currentItem.nextListItem.value = value;
                    return;
                }
                currentItem = currentItem.nextListItem;
            }
        }
    }

    @Override
    public void delete(int index) {
        if(index == 0){
            head = head.nextListItem;
            -- length;
        }else {
            ListItem<V> currentItem = head;
            int currentIndex = 0;
            while (currentItem.nextListItem != null){
                ++ currentIndex;
                if(currentIndex == index){
                    currentItem.nextListItem = currentItem.nextListItem.nextListItem;
                    -- length;
                    return;
                }
                currentItem = currentItem.nextListItem;
            }
        }
    }

    @Override
    public V get(int index) {
        if(index == 0){
            return head.value;
        }else {
            ListItem<V> currentItem = head;
            int currentIndex = 0;
            while (currentItem.nextListItem != null){
                ++ currentIndex;
                if(currentIndex == index){
                    return currentItem.nextListItem.value;
                }
                currentItem = currentItem.nextListItem;
            }
        }
        return null;
    }

    @Override
    public ListItem<V> getListItem(int index) {
        if(index == 0){
            return head;
        }else {
            ListItem<V> currentItem = head;
            int currentIndex = 0;
            while (currentItem.nextListItem != null){
                ++ currentIndex;
                if(currentIndex == index){
                    return currentItem.nextListItem;
                }
                currentItem = currentItem.nextListItem;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void displayAll() {
        Iterator<V> linkedListIter = this.iterator();
        while (linkedListIter.hasNext()){
            System.out.print(linkedListIter.next() + " -> ");

        }
        System.out.println("null");
    }

    @Override
    public void displayAllFromKToJ(int k , int j) {
        Iterator<V> displayRangeIter = this.iterator();
        int kIndex = 0;
        while (displayRangeIter.hasNext()){
            ++ kIndex;
            if(kIndex - 1 >= k && kIndex - 1 <= j) {
                System.out.print(displayRangeIter.next() + " -> ");
            } else {
                displayRangeIter.next();
            }
            if(kIndex > j){
                System.out.println("...");
            }
        }
    }

    @Override
    public void reverseAllList() {
        if(!isEmpty() && length > 1) {
            tail = head;
            ListItem<V> current = head.nextListItem;
            head.nextListItem = null;
            while (current != null) {
                ListItem<V> nextItem = current.nextListItem;
                current.nextListItem = head;
                head = current;
                current = nextItem;
            }
        }
    }

    @Override
    public void reverseFromKToJ(int k, int j) {
        if(k == 0 && j == length - 1){
            reverseAllList();
        }else {
            Deque<V> componentsStack = new ArrayDeque<V>();
            for(int fillStack = k; fillStack <= j; fillStack ++){
                componentsStack.push(get(fillStack));
            }
            for(int setIndex = k; setIndex <= j; setIndex ++){
                setByIndex(componentsStack.poll() , setIndex);
            }
        }
    }

    public int getLength() {
        return length;
    }

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {
            ListItem<V> currentItem = head;

            @Override
            public boolean hasNext() {
                return currentItem != null;
            }

            @Override
            public V next() {
                ListItem<V> resultItem = currentItem;
                currentItem = currentItem.nextListItem;
                return resultItem.value;
            }
        };
    }
}
