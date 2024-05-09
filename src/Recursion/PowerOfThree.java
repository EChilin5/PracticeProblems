package Recursion;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n < 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        return powerOfthree(n);
    }

    public boolean powerOfthree(int n){
        if (n == 1) {
            return true;
        }
        // If n is not divisible by 3 or is less than 3, it's not a power of three
        if (n < 3 || n % 3 != 0) {
            return false;
        }
        // Recursively check for n/3
        return powerOfthree(n / 3);
    }
}
