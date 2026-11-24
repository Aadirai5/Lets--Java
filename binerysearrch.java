// Searches for an element in a sorted array

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(arr, 30);

        System.out.println("Index = " + index);
    }
}
