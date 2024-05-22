package Recursion;

public class PrintCombinations {
    public static void main(String[] args) {
        printCombo(new int[]{1,2,3,4,5});
    }

    public static void printCombo(int[] array){
         print(array, 0);
    }

    public static  void print(int[] array, int count){
        if(count == array.length-1){
            return;
        }
        printSeries(array, array[count], count);

        print(array, count + 1);

    }

    public static void printSeries(int[] array, int index, int count){
        if(count == array.length-1){
            return;
        }

        System.out.println(index + " " + array[count]);
        printSeries(array, index, count+1);
    }
}
