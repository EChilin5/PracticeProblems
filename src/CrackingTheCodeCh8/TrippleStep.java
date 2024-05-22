package CrackingTheCodeCh8;

public class TrippleStep {

    public static void main(String[] args) {
      System.out.println(trippleStep(4));
    }

    public static int trippleStep(int n){
        if(n < 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return trippleStep(n-1) + trippleStep( n-2) + trippleStep(n-3);
    }
}
