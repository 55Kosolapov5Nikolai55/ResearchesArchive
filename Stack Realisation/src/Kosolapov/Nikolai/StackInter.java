package Kosolapov.Nikolai;

public interface StackInter <V> {

    boolean empty();
    boolean fullFilled();
    V push(V value);
    V peek();
    V pop();
    int search(Object o);
    void displayAll();
}
