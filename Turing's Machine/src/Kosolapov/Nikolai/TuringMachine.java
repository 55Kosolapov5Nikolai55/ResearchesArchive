package Kosolapov.Nikolai;

import java.util.LinkedList;

public class TuringMachine {

    private String [] tape;
    private LinkedList<String> alphabet;
    private int currentIndex;



    public void displayTape () {
        for (String displayValue : tape) {
            System.out.println(displayValue + " ");
        }
    }

    public void displayCurrentPosition () {
        System.out.println(currentIndex);
    }

    public boolean correctTape (String[] tape) {
        int inAlphabetCheckCounter = 0;
        for (int inAlphabetCheckIndex = 0; inAlphabetCheckIndex < tape.length; inAlphabetCheckIndex ++) {
            if(alphabet.contains(tape[inAlphabetCheckIndex])){
                ++ inAlphabetCheckCounter;
            }
        }
        return inAlphabetCheckCounter == tape.length;
    }

    private void fillUpTape (String[] tape) {

        if(tape.length > 0) {
            for (int fillUpIndex = 0; fillUpIndex < tape.length; fillUpIndex++) {
                if (tape[fillUpIndex] == null) {
                    tape[fillUpIndex] = "a0";
                }
                if (correctTape(tape)) {
                    this.tape = tape;
                }
            }
        }
    }

    public TuringMachine (String[] tape , LinkedList<String> alphabet , int currentIndex) {
        if (currentIndex >= -1 && currentIndex < tape.length && alphabet != null) {
            this.alphabet = alphabet;
            alphabet.add("a0");
            fillUpTape(tape);
            this.currentIndex = currentIndex;
        }
    }

    public void writeCommand (String value , String motion) {
        tape[currentIndex] = value;
        if(motion.equals("L")){
            if (hasPrevious()) {
                -- currentIndex;
            }
        }
        if(motion.equals("R")){
            if (hasNext()) {
                ++ currentIndex;
            }
        }
    }

    public boolean hasNext () {
        return currentIndex + 1 < tape.length;
    }

    public boolean hasPrevious () {
        return currentIndex - 1 >= -1;
    }

}
