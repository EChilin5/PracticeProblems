package SortMethods;

public class BubbleSort {

    public static int[] bubbleSort(int[] array){
        return sortA(array, 0);
    }

    // check that the array is in sequential order
    // base case if count reached the end of the array loop
    // which will return true
    public static boolean validSort(int[] array, int count){
        if(count == array.length-1){
            return true;
        }
        if(array[count] > array[count+1]){
            return false;
        }
        return validSort(array,count+1);
    }

    public static int[] sortA(int[] array, int count){
        if(count == array.length-1 ){
            // check if item is sorted
            boolean checkSort = validSort(array, 0);
            // return array if sorted
            if(checkSort){
                return array;
            }
            // if not than resort the array
            return sortA(array, 0);
        }

        // get the current value
        // and the next value
        // swap the value with each other
        int current = array[count];
        int next = array[count+1];
        if(current > next){
            array[count] = next;
            array[count+1] = current;
        }


        return sortA(array, count+1);
    }

    public static void main(String[] args) {
        int[] array = bubbleSort(new int[]{5,1,4,2,8,3});
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
