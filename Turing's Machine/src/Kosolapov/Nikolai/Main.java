package Kosolapov.Nikolai;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println("First example:");
        LinkedList<String> alphabet = new LinkedList<>();
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        String [] tape = {null , null ,  "X" , "Y" , "Z"};
        LinkedList<TuringMachine.Condition> conditionsMT = new LinkedList<>();
        TuringMachine.Condition q0 = new TuringMachine.Condition();
        TuringMachine.Condition q2ForZ = new TuringMachine.Condition("X" , "B" , "L" , q0);
        TuringMachine.Condition q1ForZ = new TuringMachine.Condition("Z" , "X" , "N" , q2ForZ);
        TuringMachine.Condition q1ForY = new TuringMachine.Condition("Y" , "Y" , "R" , q1ForZ);
        TuringMachine.Condition q1ForX = new TuringMachine.Condition("X" , "Z" , "R" , q1ForY);
        TuringMachine.Condition q1ForA0 = new TuringMachine.Condition("a0" , "a0" , "R" , q1ForX);
        TuringMachine MT = new TuringMachine(tape , alphabet , conditionsMT , 0 , q1ForA0 , q0);
        MT.runMachine();
        MT.displayCurrentIndex();
        System.out.println("Second example:");
        LinkedList<String> alphabet1 = new LinkedList<>();
        alphabet1.add("1");
        alphabet1.add("+");
        String [] tape1 = {"1" , "1" , "1" , "1" , "1" , "+" , "1" , "1" , "1" , "1" , "1" , null};
        LinkedList<TuringMachine.Condition> conditionsMT1 = new LinkedList<>();
        TuringMachine.Condition q3For1 = new TuringMachine.Condition("1" , "a0" , "L" , q0);
        TuringMachine.Condition q2ForA0 = new TuringMachine.Condition("a0" , "a0" , "L" , q3For1);
        TuringMachine.Condition q2For1 = new TuringMachine.Condition("1" , "1" , "R" , q2ForA0);
        TuringMachine.Condition q1ForPlus = new TuringMachine.Condition("+" , "1" , "R" , q2For1);
        TuringMachine.Condition q1For1 = new TuringMachine.Condition("1" , "1" , "R" , q1ForPlus);
        TuringMachine MT1 = new TuringMachine(tape1 , alphabet1 , conditionsMT1 , 0 , q1For1 , q0);
        MT1.runMachine();
        MT1.displayCurrentIndex();
    }
}
