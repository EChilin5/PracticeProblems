package Recursion;

public class FirstUpperCase {
    // base case if it reached the end of the string
    // return false
    // base case if found the uppercase return letter


    public static String upperCase(String s) {
        return isUpperCase(s, 0);
    }
    public static String isUpperCase(String s, int count){
        if(count == s.length()){
            return "";
        }
        if(Character.isUpperCase(s.charAt(count))){
            return String.valueOf(s.charAt(count));
        }
        return isUpperCase(s, count+1);
    }

    public static void main(String[] args) {
        System.out.println(upperCase("jkngreKfew"));
    }
}
