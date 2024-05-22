package CrackingTheCodeCh8;

public class MagicIndex {
    public static void main(String[] args) {
        System.out.println(magicIndex(new int[]{21,32,2,54,57,26}));
    }

    public static int magicIndex(int[] array){
        return magic(array, 0 );
    }

    public static int magic(int[] array, int count){
        if(array.length == count){
            return -1;
        }
        if(array[count] == count){
            return count;
        }
        return magic(array, count+1);

    }
}
