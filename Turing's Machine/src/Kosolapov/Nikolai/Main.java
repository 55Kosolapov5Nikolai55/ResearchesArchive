package Kosolapov.Nikolai;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> alphabet = new LinkedList<>();
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        String [] tape = {null , "X" , "Y" , "Z"};
        TuringMachine floatingPointMachine = new TuringMachine(tape , alphabet , 0);
        floatingPointMachine.writeCommand("a0" , "R");
        floatingPointMachine.writeCommand("Z" , "R");
        floatingPointMachine.writeCommand("Y" , "R");
        floatingPointMachine.writeCommand("X" , "L");
        floatingPointMachine.writeCommand("Y" , "L");
        floatingPointMachine.writeCommand("Z" , "N");
        floatingPointMachine.displayTape();
        System.out.print("Current position: ");
        floatingPointMachine.displayCurrentPosition();
    }
}
