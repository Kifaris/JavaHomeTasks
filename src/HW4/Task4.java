package HW4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int n = 111, even = 0, odd = 0;
        int[] massive = new int[n];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = ((int) (Math.random() * 300) - 100);
            if (massive[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] masEven = new int[even];
        for (int j = 0, i = 0; j < even; j++, i++) {
            if (massive[i] % 2 == 0) {
                masEven[j] = massive[i];
            } else {
                j--;
            }
        }
        Arrays.sort(masEven);
        int[] masOdd = new int[odd];
        for (int k = 0, i = 0; k < odd; k++, i++) {
            if (massive[i] % 2 != 0) {
                masOdd[k] = massive[i];
            } else {
                k--;
            }
        }
        Arrays.sort(masOdd);
        System.out.println("Изначальный массив" + Arrays.toString(massive));
        System.out.println("Массив с четными числами" + Arrays.toString(masEven));
        System.out.println("Массив с нечетными числами" + Arrays.toString(masOdd));
    }
}
