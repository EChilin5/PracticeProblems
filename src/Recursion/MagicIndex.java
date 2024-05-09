package Recursion;

public class MagicIndex {
    // 0 1 2 3 4 5 6 7 8 9
    // 1 2 4 3 5 6 7 5 2 5
    //solution would be 3, 3 since index matches number

    public static int magic(int[] array){
        return findMagic(array, 0);
    }

    public static int findMagic(int[] array, int counter){
       // base case check if counter= array[counter] return
        if(counter == array[counter]){
            return counter;
        }

        // counter == array.length -1
        //return -1
        if(array.length - 1 == counter){
            return -1;
        }
        return findMagic(array, counter+1);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4,3, 5, 6, 7, 5, 2, 5};
        System.out.println(magic(array));
    }
}
