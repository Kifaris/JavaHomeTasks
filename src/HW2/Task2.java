package HW2;

public class Task2 {
    public static void main(String[] args) {
        int firstNumber = 10, secondNumber = 9;
        switch (secondNumber) {
            case 3:
                System.out.println(firstNumber + secondNumber);
                break;
            case 5:
                System.out.println(firstNumber - secondNumber);
                break;
            case 7:
                System.out.println(firstNumber * secondNumber);
                break;
            case 9:
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Ошибка");
        }
    }

}
