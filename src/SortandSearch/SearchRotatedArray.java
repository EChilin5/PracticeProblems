package SortandSearch;

public class SearchRotatedArray {
    // 15, 16, 19,20, 25, 1, 3, 4, 5, 7, 10, 14
    //  0   1  2   3   4  5  6  7  8  9  10  11
    // get midpoint of the array which is array 4 value 25
    // we are looking for value 5
    // split array in half and search for index
    // 15 to 25
    // 1 to 14 we use this section
    // we check midpoint if value is present
    // 1 to 5
    // 7 to 14
    public static void main(String[] args) {
        int[] array = new int[]{15, 16, 19,20, 25, 0, 1, 3, 4, 5, 7, 10, 14};
        int value = search(array, 0, array.length-1, 16);
        System.out.println(value);
    }

    //original solutoin
    public static int searchOG(int[] array, int low, int high, int target){
        if(low > high){
            return -1;
        }
        // get mid point by dividing low+high by 2
        int mid = (low+high)/2;

        // check if it exist in the mid value of the array
        if(array[mid] == target){
            return mid;
        }

        if(target < array[mid]){
            // check if the item exist in the left part of the array
            searchOG(array, low, mid-1, target);
        }else{
            // check if the item exist in the right part of the array
            searchOG(array, mid+1, high, target);
        }
        // return if it does not exist
        return -1;
    }
    // a solution i found after my solution
    public static int search(int[] array, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int location = -1;
        // get mid point
        int mid = (low + high)/2;
        // check if midpoint is equal to 5
        if(array[mid] == target){
            System.out.println("found " + mid);
            location = mid;
            return location;

        }
        //check if item is less than mid and search in that area
        if(array[low] <= array[mid]){
            // search left half
            if(array[low] <= target && target <= array[mid]){
                search(array, low, mid-1, target);
            }else{
                // search the right half of the list
                search(array, mid+1, high, target);
            }
        }
        // check the right side of the array
        if(array[mid] < target && target < array[high]){
            return search(array, mid+1, high, target);
        }else{
            search(array, low, mid-1, target);
        }

        return location;
    }

 }
