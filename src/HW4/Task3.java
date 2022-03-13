package HW4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 11, a = 0, b = 0, c = 0;
        int[]array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 3) - 1);
                if (array[i] == 1) {
                    a += 1;
                } else if (array[i] == 0) {
                    b += 1;
                } else if (array[i] == -1) {
                    c += 1;
                }
        }
        System.out.println(Arrays.toString(array));
        if (a > b && b >c) System.out.println("Больше всего 1");
        else if (b > a && b > c) System.out.println("Больше всего 0");
        else if (c > a && c > b) System.out.println("Больше всего -1");
        else System.out.println("Нет доминирующего значения");
    }
}
