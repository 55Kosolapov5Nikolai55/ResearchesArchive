package com.KosolapovNikolai;

public class ArrayListC<V> { //ArrayList Class.
    private int capacity; // Capacity of our values' array.
    private int defaultCapacity = 9; // Capacity of our values' array (if use empty constructor).
    private int size; // Quantity of values in array.
    private Object[] values; // Array of values.

    public ArrayListC(){ // Empty constructor.
        this.capacity = defaultCapacity;
        values = new Object[capacity];
    }

    public ArrayListC(int capacity){ // Constructor with specified capacity of array.
        this.capacity = capacity;
        values = new Object[capacity];
    }

    public void add(V value){ // Add new value to the value's array.
        if(size + 1 > this.values.length){this.resize(); ++size; return;}
        this.values[size] = value; // Index of new value is equal to index of first available slot.
        ++size;
    }

    public V get(int index){ // Get the element (by index).
        if(index >= this.values.length){return null;} // If values' array is empty, method returns null.
        return (V)this.values[index];
    }

    public void deleteByIndex(int index){ // Delete the value (by index).
        if(this.values.length == 0){return;}
        Object[] oldValues = this.values;
        Object[] newValues = new Object[capacity];

        for(int i = 0; i < this.capacity; i++){
            if(i == 0){newValues[i] = oldValues[i + 1];}
            if(i < index){newValues[i] = oldValues[i];}
            if(i > index){newValues[i - 1] = oldValues[i];}
        }
        this.values = newValues;
        --size;
    }

    public void deleteByValue(V value){ // Delete the value (by value).
        int requiredIndex = 0;
        for (int i = 0; i < this.values.length; i++){
            if(this.values[i] == value){ // Find index of the required value (Linear Search).
                requiredIndex = i;
                this.deleteByIndex(requiredIndex); // Use deleting by index.
                break;
            }
        }
    }

    private void resize(){ // Resize values' array if there is no place for new value.
        int oldCapacity = this.capacity;
        int newCapacity = (oldCapacity * 3) / 2 + 1;
        Object[] oldValues = this.values;
        Object[] newValues = new Object[newCapacity];

        for(int i = 0; i < oldValues.length; i++){
            newValues[i] = oldValues[i];
        }
        this.capacity = newCapacity;
        this.values = newValues;
    }

    public int getCapacity() {
        return capacity + 1; // Because elements' indexes in arrays starts from 0.
    }

    public int getSize() {
        return size;
    }
}
