package HW5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String r = scan.nextLine();
        String r1 = r.replaceAll("[\u0044 \u004A]", "");
        StringBuilder ra1 = new StringBuilder(r1);
        String revers = ra1.reverse().toString();
        if (r1.equalsIgnoreCase(revers))
            System.out.println("полиндром");
    }
}
