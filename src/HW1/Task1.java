package HW1;

public class Task1 {
    public static void main(String[] args) {
        int sum = 675_368; // Задал случайное число, чтобы рассчет производился
        int res = sum > 100_000 ? (sum - sum * 10 / 100) : sum;
        System.out.println(res);

    }
}
