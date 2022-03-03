package HW2;

public class Task1 {
    public static void main(String[] args) {
        byte count = 88;
        if (count < 101 && count > 89) {
            System.out.println("Отлично");
        } else if (count < 90 && count > 59) {
            System.out.println("Хорошо");
        } else if (count < 60 && count > 39) {
            System.out.println("Удовлетворительно");
        } else if (count < 40 && count >= 0) {
            System.out.println("Попробуйте в следующий раз");
        } else {
            System.out.println("Ошибка");
        }
    }
}
