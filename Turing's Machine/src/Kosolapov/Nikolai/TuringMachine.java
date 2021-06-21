package Kosolapov.Nikolai;

import java.util.LinkedList;
import java.util.Objects;

public class TuringMachine {

    private String[] tape;
    private LinkedList<String> alphabet;
    private static LinkedList<Condition> conditionsMT;
    private Condition currentCondition;
    private Condition stopCondition;
    private int currentIndex;

    private void displayTape() {
        for (String displayValue : tape) {
            System.out.print(displayValue + " ");
        }
        System.out.println("|");
    }

    private boolean isCorrectTape(String[] tape) {
        int inAlphabetCheckCounter = 0;
        for (int inAlphabetCheckIndex = 0; inAlphabetCheckIndex < tape.length; inAlphabetCheckIndex++) {
            if (alphabet.contains(tape[inAlphabetCheckIndex])) {
                ++inAlphabetCheckCounter;
            }
        }
        return inAlphabetCheckCounter == tape.length;
    }

    private void fillUpTape(String[] tape) {

        if (tape.length > 0) {
            for (int fillUpIndex = 0; fillUpIndex < tape.length; fillUpIndex++) {
                if (tape[fillUpIndex] == null) {
                    tape[fillUpIndex] = "a0";
                }
                if (isCorrectTape(tape)) {
                    this.tape = tape;
                }
            }
        }

    }

    public TuringMachine(String[] tape, LinkedList<String> alphabet, LinkedList<Condition> conditionsMT, int currentIndex, Condition currentCondition, Condition stopCondition) {
        if (currentIndex < tape.length && alphabet != null && conditionsMT != null && currentCondition != null && stopCondition != null) {
            this.alphabet = alphabet;
            alphabet.add("a0");
            fillUpTape(tape);
            TuringMachine.conditionsMT = conditionsMT;
            this.currentIndex = currentIndex;
            this.currentCondition = currentCondition;
            this.stopCondition = stopCondition;
        }
    }

    public static class Condition {
        private String defineValue;
        private Condition nextCondition;
        private String value;
        private String motion;


        public Condition(String defineValue, String value, String motion, Condition nextCondition) {

            if (defineValue != null && nextCondition != null && value != null && motion != null) {
                this.defineValue = defineValue;
                this.nextCondition = nextCondition;
                this.value = value;
                this.motion = motion;
            }
        }

        public Condition() {
            // Stop - condition;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Condition condition = (Condition) o;
            return Objects.equals(defineValue, condition.defineValue);

        }
    }

    public void runMachine () {
        displayTape();
        while (currentCondition != stopCondition) {
            while (currentCondition.defineValue.equals(tape[currentIndex])) {
                executeCommand(currentCondition);
                if (currentCondition.nextCondition == stopCondition) {
                    break;
                }
            }
            currentCondition = currentCondition.nextCondition;
        }
        displayTape();
    }

    public void executeCommand (Condition condition) {
        tape[currentIndex] = condition.value;
        if(condition.motion.equals("L")){
            if (hasPrevious()) {
                -- currentIndex;
            }
        }
        if(condition.motion.equals("R")){
            if (hasNext()) {
                ++ currentIndex;
            }
        }
    }

    private boolean hasNext () {
        return currentIndex + 1 < tape.length;
    }

    private boolean hasPrevious () {
        return currentIndex - 1 >= 0;
    }

    public void displayCurrentIndex () {
        System.out.println(currentIndex);
    }

}
