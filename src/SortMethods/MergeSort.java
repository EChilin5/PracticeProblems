package SortMethods;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {70,50,30,10,20,40,60};
        int[] merged = mergeSort(arr, 0, arr.length-1);

        for(int i = 0; i < merged.length;i++){
            System.out.println(merged[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int low, int high){
        if(low == high){
            int[] br= new int[1];
            br[0]= arr[low];
            return br;
        }
        // get the mid point of the index by dividing it by 2
        int mid = (low + high ) /2;
        // get the first half of the array
        int[] firstHalf = mergeSort(arr, low, mid);
        print(firstHalf);
        // get the second half of the array
        int[] secondHalf = mergeSort(arr, mid+1,high);
        print(secondHalf);
        int[] merged = mergeTwoArray(firstHalf, secondHalf);
        return merged;
    }

    public static void print(int[] array){
        System.out.println("");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] mergeTwoArray(int[] first, int[] second){
        int[] sorted = new int[first.length + second.length];
        // will track i pointer
        int i = 0;
        // will track j pointer
        int j = 0;
        // will track the overall sorted values
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                sorted[k] = first[i];
                k++;
                i++;
            }else{
                sorted[k] = second[j];
                k++;
                j++;
            }
        }

        if( i == first.length){
            while(j < second.length){
                sorted[k] = second[j];
                k++;
                j++;
            }
        }
        if( j == second.length){
            while(i < first.length){
                sorted[k] = first[i];
                k++;
                i++;
            }
        }
        return  sorted;
    }
}
