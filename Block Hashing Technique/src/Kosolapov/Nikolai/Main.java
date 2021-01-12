package Kosolapov.Nikolai;

public class Main {

    // Hash Management function:
    public static int blockStringHashing(String stringToHash, HashBlockInter hbi) {
        if(stringToHash.length() > 0) {
            char[] components = stringToHash.toCharArray();
            char[][] parts = hbi.separation(components);
            char[] firstPart = parts[0];
            char[] secondPart = parts[1];
            int hashValueFirstPart = hbi.hash1Part(firstPart, 31);
            int hashValueSecondPart = hbi.hash2Part(secondPart);
            int hash = hbi.union(hashValueFirstPart, hashValueSecondPart, components.length);
            return hash;
        }
        return -1;
    }



    public static void main(String[] args) {
        String stringForTest = "Father";
        String stringForTest1 = "Mom";
        String stringForTest2 = "Son";
        String stringForTest3 = "Computer";
        String stringForTest4 = "Compute";
        String stringForTest5 = "C o m p u t e r";
        String stringForTest6 = "noS";
        String stringForTest7 = "moM";
        String stringForTest8 = "Block";
        String stringForTest9 = "Hashing";
        String stringForTest10 = "Technology";
        String stringForTest11 = ".";
        String stringForTest12 = "";
        String stringForTest13 = "Second";
        String stringForTest14 = "Time";
        String stringForTest15 = "|-_^ _-_^_-_^_-|";

        HashBlockInter hashBIForExample = new HashBlockInter() {
            // Hashcode maps and separation's method:
            @Override
            public char[][] separation(char[] components) {
                if (components.length > 0) {
                    int partLength;
                    char[] components1Part;
                    char[] components2Part;
                    partLength = components.length / 2;
                    components1Part = new char[partLength];
                    components2Part = new char[components.length - partLength];

                    for (int componentsPartsCopyIndex = 0; componentsPartsCopyIndex < components.length; componentsPartsCopyIndex++) {
                        if (componentsPartsCopyIndex < partLength) {
                            components1Part[componentsPartsCopyIndex] = components[componentsPartsCopyIndex];
                        }
                        if (componentsPartsCopyIndex >= partLength) {
                            components2Part[componentsPartsCopyIndex - partLength] = components[componentsPartsCopyIndex];
                        }
                    }
                    char[][] componentsParts = {components1Part, components2Part};
                    return componentsParts;
                }
                return null;
            }

            @Override
            public int hash1Part(char[] components1Part, int aConstant) {
                if (components1Part.length > 0) {
                    int hash = 0;
                    for (int polynomialAccumulation = components1Part.length - 1; polynomialAccumulation >= 0; polynomialAccumulation--) {
                        hash = (hash * aConstant) + components1Part[polynomialAccumulation];
                    }
                    return hash;
                }
                return -1;
            }

            @Override
            public int hash2Part(char[] components2Part) {
                if (components2Part.length > 0) {
                    int hash = 0;
                    for (int componentSum = 0; componentSum < components2Part.length; componentSum++) {
                        hash = hash + components2Part[componentSum];
                    }
                    return hash;
                }
                return -1;
            }

            @Override
            public int union(int hash1, int hash2, int n) {
                int[] hashes = {hash1, hash2};
                int unionHash = 0;
                for (int calculateUnionHashIndex = 0; calculateUnionHashIndex < hashes.length; calculateUnionHashIndex++) {
                    unionHash = (unionHash * n) + hashes[calculateUnionHashIndex];
                }
                if (unionHash < 0) {
                    return -unionHash;
                }
                return unionHash;
            }
        };
        System.out.println("Value: " + stringForTest + " ; Hash: " + blockStringHashing(stringForTest, hashBIForExample));
        System.out.println("Value: " + stringForTest1 + " ; Hash: " + blockStringHashing(stringForTest1, hashBIForExample));
        System.out.println("Value: " + stringForTest2 + " ; Hash: " + blockStringHashing(stringForTest2, hashBIForExample));
        System.out.println("Value: " + stringForTest3 + " ; Hash: " + blockStringHashing(stringForTest3, hashBIForExample));
        System.out.println("Value: " + stringForTest4 + " ; Hash: " + blockStringHashing(stringForTest4, hashBIForExample));
        System.out.println("Value: " + stringForTest5 + " ; Hash: " + blockStringHashing(stringForTest5, hashBIForExample));
        System.out.println("Value: " + stringForTest6 + " ; Hash: " + blockStringHashing(stringForTest6, hashBIForExample));
        System.out.println("Value: " + stringForTest7 + " ; Hash: " + blockStringHashing(stringForTest7, hashBIForExample));
        System.out.println("Value: " + stringForTest8 + " ; Hash: " + blockStringHashing(stringForTest8, hashBIForExample));
        System.out.println("Value: " + stringForTest9 + " ; Hash: " + blockStringHashing(stringForTest9, hashBIForExample));
        System.out.println("Value: " + stringForTest10 + " ; Hash: " + blockStringHashing(stringForTest10, hashBIForExample));
        System.out.println("Value: " + stringForTest11 + " ; Hash: " + blockStringHashing(stringForTest11, hashBIForExample));
        System.out.println("Value: " + stringForTest12 + " ; Hash: " + blockStringHashing(stringForTest12, hashBIForExample));
        System.out.println("Value: " + stringForTest13 + " ; Hash: " + blockStringHashing(stringForTest13, hashBIForExample));
        System.out.println("Value: " + stringForTest14 + " ; Hash: " + blockStringHashing(stringForTest14, hashBIForExample));
        System.out.println("Value: " + stringForTest15 + " ; Hash: " + blockStringHashing(stringForTest15, hashBIForExample));

        String[] checkForCollisionsArray = {stringForTest, stringForTest1, stringForTest2, stringForTest3,
                stringForTest4, stringForTest5, stringForTest6, stringForTest7,
                stringForTest8, stringForTest9, stringForTest10, stringForTest11,
                stringForTest12, stringForTest13, stringForTest14, stringForTest15};
        
        for (int checkIndexCurrent = 1; checkIndexCurrent < checkForCollisionsArray.length; checkIndexCurrent ++) {
            int currentHash = blockStringHashing(checkForCollisionsArray[checkIndexCurrent] , hashBIForExample);
                if (currentHash == blockStringHashing(checkForCollisionsArray[checkIndexCurrent - 1] , hashBIForExample)) {
                    System.out.println("COLLISION!");
                }
            }
            System.out.println("We didn't get a collision!");
        }
    }