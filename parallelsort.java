// Sorts an array using a parallel sorting implementation.

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        Arrays.parallelSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}