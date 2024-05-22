package CrackingTheCodeCh8;

public class PowerSet {
    public static void main(String[] args) {
       powerSet("Testing");
    }

    public static void powerSet(String s){
        power(s, 0);
    }
    public static void power(String s, int count){
        if(s.length()-1 == count){
            return;
        }
        int i = 0;
        String res = "";
        while (i <= count){
            res += s.charAt(i++);
        }
        System.out.println(res);
        power(s, count+1);
    }
}
