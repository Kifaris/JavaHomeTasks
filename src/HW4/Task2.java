package HW4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[]b = new int[20 / 2];
        for (int i = 0, j = 2; i < b.length; i++, j += 2) {
            b[i] = j;
        }
        for (int i = 0, j = 20; i < b.length; i++, j -= 2) {
            b[i] = j;
        }
        System.out.println(Arrays.toString(b));
    }

}
