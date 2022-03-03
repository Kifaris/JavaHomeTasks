package HW1;

public class Task4 {
    double a = 45.6; // Требовался Double
    long b = 60000;
    double c = a / b; // Требовался Double так как одно из чисел с плавающей точкой

    int x = 34;
    long y = 78;
    long z = x / y; // требовался long, так как одно из чисел имело такой тип данных (по максимуму)

    double n = 90.8;
    double m = -100.1;
    double max = n > m ? n : m;

    byte code = 1;
    byte isActive = code; // разные типы данных...
}
