package pro.sky;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final Random RNG = new Random();

    public static void task1() {
        int[] arr = generate();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("Sum: %d", sum);
    }

    public static void task2() {
        int[] arr = generate();
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Min: %d, Max: %d", min, max);
    }

    public static void task3() {
        int[] arr = generate();
        System.out.println(Arrays.toString(arr));
        long sum = 0;
        long count = 0;
        for (int i : arr) {
            sum += i;
            count++;
        }
        System.out.printf("Average: %.2f", (double) sum / count);
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
