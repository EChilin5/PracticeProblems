package SortandSearch;

public class SparseSearch {
    // given a sorted array of string that is intersped with
    // empty strings write a method to find a location of a given string
    // target  = ball
    // array = {"at", "", "","", "ball", "","","car", "", "", "dad", "", "",}
    //            0    1   2  3    4      5  6   7     8   9    10    11  12
    // output = 4
    public static void main(String[] args) {
        String[] array = new String[]{"at", "", "","", "ball", "","","car", "", "", "dad", "", "",};
        String target = "ball";
        System.out.println(sparseSearch(array, target, 0, array.length-1));
    }

    public static int sparseSearch(String[] array, String target, int low, int high){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(array[mid].equals(target)){
            // return intended index if present
            System.out.println("found " +mid);
            return mid;
        }

        // will search the entire left section of the array
        // ball is currently in the left half so it won't have to search the other index
        // need to find a way to check which section to search for since
        // we can not compare indexes since it uses a string instead of an index
         sparseSearch(array,target, low, mid-1);
        // will search the entire right section of the array
        sparseSearch(array,target, mid+1, high);

        // default if it can not be found
        return -1;
    }
}
