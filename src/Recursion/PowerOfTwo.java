package Recursion;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        return powerOfTwo(n);
    }

    public boolean powerOfTwo(int n){
        if(n == 0){
            return true;
        }
        if( n < 0){
            return false;
        }
        return powerOfTwo(n-2);
    }
}
