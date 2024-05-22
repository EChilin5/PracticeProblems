package CrackingTheCodeCh8;

public class Parens {
    // ()()()
    // ( ( (  ) ) )

    public static void main(String[] args) {
        System.out.println(valid("()()()"));
    }

    public static boolean valid(String s){
        return checkValid(s, 0, 0);
    }

    public static boolean checkValid(String s, int index, int openCount){
        if(index == s.length()){
            return openCount == 0;
        }

        char currentIndex = s.charAt(index);

        if(currentIndex == '('){
            return checkValid(s, index+1, openCount+1);
        }else if(currentIndex == ')'){
            if(openCount == 0){
                return false;
            } else {
                return checkValid(s, index+1, openCount-1);
            }
        }
        return  false;
    }
}
