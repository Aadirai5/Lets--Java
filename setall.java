//Sets each array element using a function based on its index.

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Arrays.setAll(arr, i -> i * 2);

        System.out.println(Arrays.toString(arr));
    }
}