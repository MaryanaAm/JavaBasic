package Lesson_1;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        // 	Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        char operator;
        System.out.println("Введите целое положительное число:");
        System.out.println("Введите число 1: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода! Неверный формат числа.");
            System.out.print("Введите число 1: ");
            scanner.nextLine();
        }
        int a = scanner.nextInt();
        //IntelliJ IDEA сама заменила мою конструкцию while с if/else на do while
        do {
            System.out.println("Выберите действие: (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.println("Введите корректный символ"); // вывод сообщения об ошибке
        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');

        System.out.println("Введите число 2: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка ввода! Неверный формат числа.");
            System.out.print("Введите число 2: ");
            scanner.nextLine();
        }
        int b = scanner.nextInt();

        //IntelliJ IDEA также предлажила более компактный вариант записи без break;
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> {
                System.out.println("error");
                return;
            }
        }
        // System.out.println(a + " " + operator + " " + b + " = " + result);
        System.out.printf("%d %c %d = %d", a, operator, b, result);
    }
}
