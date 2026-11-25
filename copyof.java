//Creates a copy of an array with a specified length.

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int[] copy = Arrays.copyOf(arr, 2);

        System.out.println(Arrays.toString(copy));
    }
}