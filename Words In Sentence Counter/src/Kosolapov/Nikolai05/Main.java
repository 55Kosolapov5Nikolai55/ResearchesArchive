package Kosolapov.Nikolai05;

public class Main {

    public static int wordsCountFirstWay(String sentence){
        char[] symbols = sentence.toCharArray();
        int wordsQuantity = 0;
        for (int wordsCountIndex = 0; wordsCountIndex < symbols.length; wordsCountIndex ++){
            if(symbols[wordsCountIndex] == ' '){
                ++wordsQuantity;
            }
        }
        return wordsQuantity;
    }

    public static int wordsCountSecondWay(String sentence){
        char[] symbols = sentence.toCharArray();
        int nonWhiteSpace = 0;
        for(int countWordsIndex = 0; countWordsIndex < symbols.length; countWordsIndex ++){
            if(symbols[countWordsIndex] != ' '){
                ++ nonWhiteSpace;
            }
        }
        return sentence.length() - nonWhiteSpace;
    }

    public static void main(String[] args) {
        String testSentence = "I love you !";
        System.out.println(testSentence);
        System.out.println("First way: " + wordsCountFirstWay(testSentence));
        System.out.println("Second Way: " + wordsCountSecondWay(testSentence));
    }
}
