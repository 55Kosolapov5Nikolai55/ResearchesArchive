package Kosolapov.Nikolai;

public interface HashBlockInter {
    char[][] separation(char[] components);
    int hash1Part(char[] components1Part , int aConstant);
    int hash2Part(char[] components2Part);
    int union(int hash1 , int hash2 , int n);
}
