package HW4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        int[] massive = new int[n];
        int a = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ((int)(Math.random() * 111) - 53);
            if (massive[i] < 0) a++; }
        int[] negativeNumbers = new int[a];
        for (int j = 0, i = 0; j < a; j++, i++) {
            if (massive[i] < 0) {
                negativeNumbers[j] = massive[i];
            } else {
                j--;
            }
        }
        System.out.println("Изначальный массив" + Arrays.toString(massive));
        System.out.println("Массив отрицательных чисел" + Arrays.toString(negativeNumbers));
    }
}
