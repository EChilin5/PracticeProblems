package Recursion;

public class TripleStep {
    public static int tripleStep(int n){
        // base case is for values are less than 0
        // return 0 since n-3 might be reach zero faster than the others
        // example tS(5-3)=> tS(2) => tS(2-3) => tS(-1) => 0
        // base case is if equal 0 then it will return 1
        // that covers all the steps that were walked
        if(n < 0){
            return  0;
        }else if(n == 0){
            return 1;
        }
            return tripleStep(n-1) + tripleStep(n-2) + tripleStep(n-3);
    }

    public static void main(String[] args) {
        System.out.println(tripleStep(5));
    }
}
