package HW5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        Scanner sr = new Scanner(System.in);
        String[] ar = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите слово");
            String word = sr.nextLine();
            ar[i] = word;
        }
        System.out.println(Arrays.toString(ar));

    }
}
