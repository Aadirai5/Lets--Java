import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int sum = Arrays.stream(arr).sum();

        System.out.println("Sum = " + sum);
    }
}

//Creates a Stream from an array.