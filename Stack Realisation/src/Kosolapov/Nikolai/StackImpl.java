package Kosolapov.Nikolai;

import java.util.Iterator;

public class StackImpl <V> implements StackInter<V> , Iterable<V> {

    private StackNode<V> top;
    private int size = 0;
    private StackNode<V>[] stackElements = new StackNode[10];
    private int pushIndex = 0;
    private static class StackNode<V> {
        V value;
        StackNode<V> nextNode;

        StackNode(V value) {
            this.value = value;
        }
    }

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {

            int currentIterIndex = -1;

            @Override
            public boolean hasNext() {
                return stackElements[currentIterIndex + 1] != null;
            }

            @Override
            public V next() {
                ++ currentIterIndex;
                return stackElements[currentIterIndex].value;
            }
        };
    }

    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public boolean fullFilled() {
        return size == stackElements.length;
    }

    @Override
    public V push(V value) {
        if(fullFilled()) {
            StackNode<V>[] stackElements = new StackNode[this.stackElements.length * 2];
            for(int copyElements = 0; copyElements < this.stackElements.length; copyElements ++){
                stackElements[copyElements] = this.stackElements[copyElements];
            }
            this.stackElements = stackElements;
        }

            if (empty()) {
                top = new StackNode<>(value);
            } else {
                StackNode<V> newNode = new StackNode<>(value);
                newNode.nextNode = top;
                top = newNode;
            }
            stackElements[pushIndex] = top;
            ++ pushIndex;
            ++ size;
            return value;
    }

    @Override
    public V peek() {
        return top.value;
    }

    @Override
    public V pop() {
        StackNode<V> resultNode = top;
        top = top.nextNode;
        -- pushIndex;
        -- size;
        return resultNode.value;
    }

    @Override
    public int search(Object o) {
        if(top.equals(o)){
            return 0;
        }
        int resultIndex = 0;
        StackNode<V> currentSearchNode = top;
        while (currentSearchNode != null){
            if(currentSearchNode.equals(o)){
                return resultIndex;
            }
            currentSearchNode = currentSearchNode.nextNode;
            ++ resultIndex;
        }
        return resultIndex;
    }

    @Override
    public void displayAll() {
        Iterator<V> displayAllIterator = iterator();
        while (displayAllIterator.hasNext()){
            System.out.println(displayAllIterator.next());
        }
    }

    public int getSize() {
        return size;
    }


}
