//Creates a Spliterator that can traverse an array and can support splitting work for parallel processing.

import java.util.Arrays;
import java.util.Spliterator;

class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        Spliterator.OfInt sp = Arrays.spliterator(arr);

        sp.forEachRemaining((int x) -> {
            System.out.println(x);
        });
    }
}