package Recursion;

public class PrintCombinationsIncreasing {

    public static void main(String[] args) {
        // k = 2, n = 3
        printSeries(5,5);
    }

    public static void printSeries(int k , int n){
        print(k, n, 1, 2);
    }

    public static void print(int k, int n, int index, int count){
        if(index > k){
            return;
        }
        printLocation(n, index, count);

        print(k, n, index+1,  count+1);
    }

    public static void printLocation(int n, int index, int count){
        if(count > n){
            return;
        }
        System.out.println(index + " " + count);
        printLocation(n, index, count+1);
    }
}
