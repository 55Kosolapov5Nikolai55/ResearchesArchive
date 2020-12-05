package com.KosolapovNikolai;

import java.util.Iterator;

public class LinkedListImpl<I> implements Iterable<I> , LinkedListInter<I>{

    private Item head;
    private int length = 0;

    private class Item{
        private I value;
        private Item next;

        public Item(I value){
            this.value = value;
        }
    }

    @Override
    public void add(I value) {
        if(head == null){head = new Item(value); ++ length; return;}
        Item currentAddItem = this.head;
        while (currentAddItem.next != null){
            currentAddItem = currentAddItem.next;
        }
        currentAddItem.next = new Item(value);
        ++ length;
    }

    @Override
    public void set(I oldValue , I value) {
        if(head == null){return;}
        if(head.value == oldValue){head.value =value; return;}
        Item currentSetItem = this.head;
        while (currentSetItem.next != null){
            if(currentSetItem.next.value == oldValue){
                currentSetItem.next.value = value;
                return;
            }
            currentSetItem = currentSetItem.next;
        }
    }

    @Override
    public void remove(I value) {
        if(head == null){return;}
        if(head.value == value){head = head.next; -- length; return;}
        Item currentRemoveItem = this.head;
        while (currentRemoveItem.next != null){
            if(currentRemoveItem.next.value == value){
                currentRemoveItem.next = currentRemoveItem.next.next;
                -- length;
                return;
            }
            currentRemoveItem = currentRemoveItem.next;
        }
    }

    @Override
    public Iterator<I> iterator() {
        return new Iterator<I>() {
            Item currentItem = head;
            @Override
            public boolean hasNext() {
                return currentItem != null;
            }

            @Override
            public I next() {
                I resultItem = currentItem.value;
                currentItem = currentItem.next;
                return resultItem;
            }
        };
    }
}
