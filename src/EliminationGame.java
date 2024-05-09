//https://leetcode.com/problems/elimination-game/description/
public class EliminationGame {
    public static void main(String[] args) {
        int[] array = new int[4];
        for(int i = 0; i< array.length; i++){
            array[i] = i+1;
            System.out.print(" " +array[i]);
        }
        System.out.println();
        System.out.println("\n"+setZeroMatrix(array));
    }


    public static int[] updateZero(int[] array){
        int index = 0;
        int zeroIndex = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] != 0){
                array[index++] = array[i];
            }else{
                zeroIndex++;
            }
        }
        int[] res = new int[array.length - zeroIndex];

        for(int i = 0; i < res.length; i++){
            System.out.print(" " + res[i] );
        }
        System.out.println();

        return res;
    }




    public static int setZeroMatrix(int[] array){

        if(array.length != 1){
            array = leftShift(array);

        }
        if(array.length != 1){
            array = righShift(array);
        }

        if(array.length == 1){
            return array[0];
        }

        return setZeroMatrix(array);
    }

    private static int[] righShift(int[] array) {
        for(int i = array.length-1; i >= 0; i=i-2){
            array[i] = 0;
        }
        return updateZero(array);
    }

    private static int[] leftShift(int[] array) {
        for(int i = 0; i < array.length; i=i+2){
            array[i] =0;
        }
        return updateZero(array);
    }


}
