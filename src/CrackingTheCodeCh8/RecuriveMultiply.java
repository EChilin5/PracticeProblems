package CrackingTheCodeCh8;

public class RecuriveMultiply {
    public static void main(String[] args) {
        System.out.println(recursiveMultiply(500,4));
    }

    public static int recursiveMultiply(int num1, int num2){
        return mutli(num1, num2, 0, 0);
    }

    public static int mutli(int num1, int num2, int count, int sum){
        if(count == num1){
            return sum;
        }

        sum += num2;
        return mutli(num1, num2, count+1, sum);

    }

}
