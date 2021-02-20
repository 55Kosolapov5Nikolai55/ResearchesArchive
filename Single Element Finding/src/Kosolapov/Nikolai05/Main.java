package Kosolapov.Nikolai05;

public class Main {

    public static int singleNumber(int [] numbers){
        int singleNumber = 0;
        for(int current = 0; current < numbers.length - 1; current ++){
            singleNumber = numbers[current];
            for(int next = current + 1; next < numbers.length; next ++){
                if(singleNumber != numbers[next]){
                    singleNumber = numbers[next];
                }
            }
        }
        return singleNumber;
    }

    public static void main(String[] args) {
        int[] testNumbers = {3 , 3 , 5 , 34 , 3 , 5 , 12};
        System.out.println(singleNumber(testNumbers));
    }
}
