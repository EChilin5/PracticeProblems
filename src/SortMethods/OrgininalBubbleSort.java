package SortMethods;

public class OrgininalBubbleSort {
    public static void main(String[] args) {
        int[] array = bubbleSort(new int[]{5,1,4,2,8,3}, 6);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }

    private static int[] bubbleSort(int[] array, int n) {
        // Base case
        if (n == 1){
            return array;
        }
        int count = 0;
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (array[i] > array[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                count = count+1;
            }

        // Check if any recursion happens or not
        // If any recursion is not happen then return
        if (count == 0)
            return array;

        // Largest element is fixed,
        // recur for remaining array
        return bubbleSort(array, n-1);
    }
}
