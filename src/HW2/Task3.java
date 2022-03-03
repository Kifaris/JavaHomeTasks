package HW2;

public class Task3 {
    public static void main(String[] args) {
        int a = 10, b = 500;
        int random_number = a + (int) (Math.random() * b);
        if (random_number >= 25 && random_number <= 200) {
            System.out.println("Число" + " " + random_number + " " + "cодержится в интервале (25;200)");
        } else {
            System.out.println("Число" + " " + random_number + " " + "не содержится в интервале (25;200)");
        }
    }
}