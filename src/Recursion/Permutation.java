package Recursion;

public class Permutation {
    // use string builder
    // easier to delete from the array
    public static boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        StringBuilder word1 = new StringBuilder(s);
        StringBuilder word2 = new StringBuilder(t);

        return isPermutation(word1, word2);
    }


    //
    public static int isCharPresent(char s, StringBuilder t, int count){
        if(count == t.length()){
            return -1;
        }
        if(s == t.charAt(count)){
            return count;
        }
        return isCharPresent(s, t, count+1);
    }

    // we will recursively iterate through
    // the first letter of s as it will be deleted
    // t will be deleted as well
    // is Char Present will recursively look through t to find identical value
    public static boolean isPermutation(StringBuilder s, StringBuilder t){
        if(s.length() == 0 && t.length() == 0){
            return true;
        }
        char temp = s.charAt(0);
        // can I swap this out with a for loop.
        int tIndex = isCharPresent(temp, t, 0);

        if(tIndex == -1){
            return false;
        }else{
            s.deleteCharAt(0);
            t.deleteCharAt(tIndex);
        }
        return isPermutation(s,t);
    }

    public static void main(String[] args) {
        System.out.println(permutation("aKbbcd", "aPbcbd"));
    }
}
