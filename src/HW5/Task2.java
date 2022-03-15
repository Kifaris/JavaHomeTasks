package HW5;

import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        String string1 = "heLLoW";
        String string2 = "tOmoRROw";
        string1 = string1.toLowerCase().replace('h', 'H');
        string2 = string2.toLowerCase().replace('t', 'T');
        System.out.println(string1 + "\n" + string2);
    }
}
