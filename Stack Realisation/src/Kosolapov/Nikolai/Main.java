package Kosolapov.Nikolai;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        StackImpl<String> stackImplTest = new StackImpl<String>();
        stackImplTest.push("A");
        stackImplTest.push("B");
        stackImplTest.push("C");
        stackImplTest.push("D");
        stackImplTest.push("B");
        stackImplTest.push("A");
        stackImplTest.displayAll();
        System.out.println("Size: " + stackImplTest.getSize());
        System.out.println(stackImplTest.pop());
        System.out.println(stackImplTest.pop());
        System.out.println("Size: " + stackImplTest.getSize());
        System.out.println(stackImplTest.peek());
        System.out.println(stackImplTest.peek());
        System.out.println("Size: " + stackImplTest.getSize());
        System.out.println(stackImplTest.search("A"));
        System.out.println("________________________________");


        Stack<String> checkStack = new Stack<String>();
        checkStack.push("A");
        checkStack.push("B");
        checkStack.push("C");
        checkStack.push("D");
        checkStack.push("B");
        checkStack.push("A");
        Iterator<String> checkIter = checkStack.iterator();
        while (checkIter.hasNext()){
            System.out.println(checkIter.next());
        }
        System.out.println("Size: " + checkStack.size());
        System.out.println(checkStack.pop());
        System.out.println(checkStack.pop());
        System.out.println("Size: " + checkStack.size());
        System.out.println(checkStack.peek());
        System.out.println(checkStack.peek());
        System.out.println("Size: " + checkStack.size());
        System.out.println(checkStack.search("A"));


    }
}
