package com.company;

public class Main {

    public static int componentSumHash(String stringToHash){ // BAD HASHING METHOD
        int hash = 0;
        char[] components = stringToHash.toCharArray();
        for(int hashIndex = 0; hashIndex < stringToHash.length(); hashIndex ++){
            hash = hash + components[hashIndex];
        }
        return hash; // ASCII(1ST component) + ASCII(2ND component) + ... + ASCII(Nth component).
    }

    public static int polynomialAccumulationHash(String stringToHash , int aConstant){ // GOOD HASHING METHOD (P.S ~6 collisions for 50000 english words!).
        int hash = 0;
        if(aConstant > 1) {
            char[] components = stringToHash.toCharArray();
            for (int hashIndex = components.length - 1; hashIndex >= 0; hashIndex--) {
                hash = (hash * aConstant) + components[hashIndex];
            }
            return hash; // ASCII (1ST component) * a⁰ + ASCII(2ND component) * a¹ + ... + ASCII(Nth component) * aⁿ⁻¹. IMPORTANT: a - constant, which should be > 1, because if a = 0 we will get ASCII-code of first component, a = 1 - polynomial accumulation = component sum.
        }
        System.out.println("Constant value is incorrect!");
        return -1;
    }
    public static void main(String[] args) {

        // Example:
        System.out.println("Component sum results:");
        System.out.println(componentSumHash("dog"));
        System.out.println(componentSumHash("god"));

        if(componentSumHash("dog") == componentSumHash("god")){
            System.out.println("COLLISION!");
        } else {
            System.out.println("Hashes are different!");
        }
        System.out.println("________________________");
        System.out.println("Polynomial accumulation results:");
        // Let's solve this problem using polynomial accumulation:
        System.out.println(polynomialAccumulationHash("dog" , 31));
        System.out.println(polynomialAccumulationHash("god" , 31));

        if (polynomialAccumulationHash("dog" , 31) == polynomialAccumulationHash("god" , 31)){
            System.out.println("COLLISION!");
        } else {
            System.out.println("Hashes are different!");
        }
        System.out.println("________________________");
    }
}
