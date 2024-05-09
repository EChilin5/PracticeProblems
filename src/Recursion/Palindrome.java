package Recursion;

public class Palindrome {
    public static boolean isPalindrome(String s){
        return checkPalindrome(s, 0, s.length()-1);
    }

    // use two pointer approach to check if
    // items are equal to each other if there not return invalid
    public static boolean checkPalindrome(String S, int start, int end){
        System.out.println(start + "  " + end);
        if(start == end){
            return true;
        }
        if(S.charAt(start) != S.charAt(end)){
            return false;
        }

        return checkPalindrome(S, start+1, end-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rotor"));
    }
}
