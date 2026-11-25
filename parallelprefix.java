//Performs a cumulative operation on array elements

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Arrays.parallelPrefix(arr, (a, b) -> a + b);

        System.out.println(Arrays.toString(arr));
    }
}