package HW2;

public class Task4 {
    public static void main(String[] args) {
        int age = 32, exp = 56;
        if (age > 100) {
            System.out.println("Мы Вам Перезвоним");
        } else if (exp < 5) {
            System.out.println("Вы подходите на должность стажера");
        } else if (exp >= 5) {
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
