package SortandSearch;

public class SortedMerge {
    public static void main(String[] args) {
        int[] array= new int[]{1,3,5,};
        int[] array2 = new int[]{2, 4, 6, 8, 100 ,100 ,100};

        int[] result = sortMerge(array, array2);
        System.out.println("Solution ");
        print(result);

    }

    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] sortMerge(int[] l1, int[] l2){
        // find the largest array first
        // res will be large array
        int res[];
        // sub will be small array
        int sub[];
        if(l1.length > l2.length){
            res = l1;
            sub = l2;
        }else{
            res = l2;
            sub = l1;
        }
        // res iterator
        int i = 0;
        // sub iterator
        int j = 0;
        while(i < res.length && j < sub.length){
            // only the res array will need to be shifted
            // if sub is smaller than res
            // shift array left and insert the sub[j] since it's smaller
            // else update the res array to the next value to compare
            if(sub[j] < res[i]){
                res = shift(res, i, sub[j]);
                j++;
            }else{
                i++;
            }
        }
        return res;
    }

    public static int[] shift(int[] array, int location, int value){
        //shift every index by 1;
        int startingPoint = location+1;
        int current = location;
        // create a copy of the array that is empty
        int[] temp = new int[array.length];

        // update the value of temp with values that should not be updated
        for(int i = 0; i < startingPoint; i++){
            temp[i] = array[i];
        }
        // this will shift the location of every value to the right
        for(int i = startingPoint; i < array.length; i++){
            temp[i] = array[current++];
        }
        // then we added the newest least value to it's specific location
        temp[location] = value;

        return temp;
    }
}
