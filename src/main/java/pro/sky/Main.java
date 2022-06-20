package pro.sky;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    private static final Random RNG = new Random();

    public static void task1() {
        int[] arr = generate();
        System.out.println(Arrays.toString(arr));
        System.out.printf("Sum: %d",
                IntStream.of(arr).sum());
    }

    public static void task2() {
        int[] arr = generate();
        System.out.println(Arrays.toString(arr));
        System.out.printf("Min: %d, Max: %d",
                IntStream.of(arr).min().orElseThrow(),
                IntStream.of(arr).max().orElseThrow());
    }

    public static void task3() {
        int[] arr = generate();
        System.out.println(Arrays.toString(arr));
        System.out.printf("Average: %.2f",
                IntStream.of(arr).average().orElseThrow());
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(new StringBuilder(String.valueOf(reverseFullName)).reverse());
    }

    private static int[] generate() {
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = RNG.nextInt(100_000, 200_001);
        }
        return arr;
    }
}
