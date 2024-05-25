package SortandSearch;

import java.util.Arrays;

public class PeakandValley {
    public static void main(String[] args) {
        int[] array = new int[]{5, 89,90, 3, 1, 2, 3};

        int[] result = getPeaksAndValleys(array);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] getPeaksAndValleys(int[] array) {
        // Sort the array
        Arrays.sort(array);

        // Swap adjacent elements to form peaks and valleys
        for (int i = 1; i < array.length - 1; i += 2) {
            swap(array, i, i + 1);
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
