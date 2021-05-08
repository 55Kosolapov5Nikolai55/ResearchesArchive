package Kosolapov.Nikolai05;

public interface LinkedListInter<V> {
    // Non - random access methods:
    void add(V value);
    void set(V oldValue , V newValue);
    void delete(V value);

    // Random access methods:
    void add(V value , int index);
    void setByIndex(V value , int index);
    void delete(int index);
    V get(int index);
    LinkedListImpl.ListItem<V> getListItem(int index);
    // Other methods:

    boolean isEmpty();
    void displayAll();
    void displayAllFromKToJ(int k , int j);
    void reverseAllList();
    void reverseFromKToJ(int k , int j);
}
