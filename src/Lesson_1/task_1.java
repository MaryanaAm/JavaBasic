package Lesson_1;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
//      Task_1.Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
//      Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int fNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int sNum = scanner.nextInt();
        int[] arr = new int[1000];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int)Math.pow(i, 3);
        }
        System.out.println("Результат: ");
        for (int k : arr) {
            if (k == (int) Math.pow(fNum, 3)) {
                System.out.println(k);
                break;
            }
        }
        for (int j : arr) {
            if (j == (int) Math.pow(sNum, 3)) {
                System.out.println(j);
                break;
            }
        }
    }
}
