package Recursion;

public class Pow {
    public double myPow(double x, int n) {
        return pow(x, n, 0, x);
    }
    //https://leetcode.com/problems/powx-n/description/
    // this was a leet code problem in Pow(x, n)
    // did not cover all the cases
    // the count will contiue until it reaches the specific value
    // x is the value being multiplied.
    // n is the exponent
    // count will keep multiply until it reaches that index
    // base case count = n
    //  than return the value
    public double pow(double x, int n, int count, double sum){
        if(count == Math.abs(n)-1){
            if( n < 0){
                sum = 1/sum;
            }

            return sum;
        }
        sum = sum * x;

        return pow(x, n, count+1, sum);
    }
}
