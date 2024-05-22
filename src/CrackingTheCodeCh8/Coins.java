package CrackingTheCodeCh8;

import java.util.ArrayList;

public class Coins {

    public static ArrayList coins(double n){
        ArrayList<String> res = new ArrayList<>();

        return check(res, n);

    }

    public static ArrayList<String> check(ArrayList<String> res, double n){
        if(n == 0){
            return res;
        }
        System.out.println(n);
        if(n - 0.25 >= 0){
            res.add("Quarter");
            return check(res, n-0.25);
        }
        if(n-0.10 >= 0){
            res.add("Dime");
            return check(res, n-0.10);
        }

        if(n-0.05 >= 0){
            res.add("Nickle");
            return check(res, n-0.05);
        }

        if(n-0.01 >=0){
            res.add("Penny");
            return check(res, n-0.01);
        }
        return check(res, 0);
    }

    public static void main(String[] args) {
        System.out.println(coins(1.49));
    }
}
