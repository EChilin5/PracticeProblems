package Recursion;

import java.util.ArrayList;

public class Coins {
    public static ArrayList price(double n){
        ArrayList<String> coins = new ArrayList();
        return priceCheck(coins, n);
    }

    // not an optimal approach but
    // go through each item and decrease the value until n = 0;
    // then return the item in the array list
    public static ArrayList priceCheck(ArrayList<String> coins, double n){
        if(n == 0){
            return coins;
        }
        System.out.println(n);
        if( n - .25 >= 0){
            coins.add("Quarters");
            return priceCheck(coins, n-.25);
        }
        if( n - .10 >= 0){
            coins.add("Dime" );
            return priceCheck(coins, n-.10);

        }
        if( n -.05 >= 0){
            coins.add("Nickle" );
            return priceCheck(coins, n-.05);

        }
        if( n - .01 >= 0){
            coins.add("Penny" );
            return priceCheck(coins, n-.01);
        }
        return priceCheck(coins, 0);
    }

    public static void main(String[] args) {
        System.out.println(price(1.02));
    }
}
