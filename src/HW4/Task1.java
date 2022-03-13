package HW4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int n = 100;
        int[]array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1001) - 500);
        }
        int max = array[0];
        int min = array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            avg += array[i] / array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
        System.out.println(Arrays.toString(array)); // просто захотелось посмотреть на массив

    }
}
