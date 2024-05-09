package SortMethods;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = insertionSort(new int[]{9,7,6,15,17,5,}, 6);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int[] insertionSort(int[] array, int n){
        // Base case
        if (n <= 1){
            return array;
        }

        // Insert last element at its correct position
        // in sorted array.
        int last = array[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && array[j] > last)
        {
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = last;

        // Sort first n-1 elements
        return insertionSort( array, n-1 );
    }





}
