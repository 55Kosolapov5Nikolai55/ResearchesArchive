package Kosolapov.Nikolai05;

public class Main {

    public static void main(String[] args){

        // LinkedList's Implementation test:
        LinkedListImpl<Character> LLImplementation = new LinkedListImpl<Character>();
        System.out.println("Is empty: " + LLImplementation.isEmpty());
        System.out.println("Length: " + LLImplementation.getLength());
        LLImplementation.add('d');
        LLImplementation.add('d');
        LLImplementation.displayAll(); // Empty output.
        LLImplementation.add('o');
        LLImplementation.add('g');
        LLImplementation.set('g' , 'G');
        LLImplementation.delete('d');
        LLImplementation.add('!' , 1);
        LLImplementation.setByIndex('o' , 1);
        LLImplementation.delete(1);
        LLImplementation.delete(0);
        LLImplementation.add('¡');
        LLImplementation.add('!' , 0);
        LLImplementation.reverseAllList();
        System.out.println("Is empty: " + LLImplementation.isEmpty());
        System.out.println("Length: " + LLImplementation.getLength());
        System.out.println("555th element: " + LLImplementation.get(555)); // null (specified index out of elements quantity's range)
        LLImplementation.displayAll();
        LLImplementation.displayAllFromKToJ(3 , 4);
        LLImplementation.reverseFromKToJ(2 , 4);
        LLImplementation.reverseFromKToJ(3 , 4);
        LLImplementation.reverseFromKToJ(3 , 4);
        LLImplementation.reverseFromKToJ(2 , 4);
        LLImplementation.displayAll();
    }
}