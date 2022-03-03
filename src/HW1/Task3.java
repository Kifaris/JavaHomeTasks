package HW1;

public class Task3 {
    public static void main(String[] args) {
        int a = 35, b = 85, c = 46; // Где а, b и c - длинна, высота и ширина, задал рандомные числа, иначе невыводится результат
        int s = 2 * (a * b + b * c + a * c);
        System.out.println(s);
    }
}
