package SortMethods;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10,7, 8,9,1,5};
        int size = array.length;

        quickSort(array, 0, size-1);
        for(int i = 0; i < array.length; i++){
            System.out.println( array[i] + " ");
        }

    }

    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = partition(array, low, high);

            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);

        }
    }
    // takes the last element as a pivot
    // places the pivot in the correct position
    // sorted array and places all smaller items to left
    // pivot and all greater elements right to the left
    public static int partition(int[] array, int low, int high){
        // chose pivot being the end of the list
        int pivot = array[high];
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (array[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i +1, high);
        return(i+1);

    }


    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
