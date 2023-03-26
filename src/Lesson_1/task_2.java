package Lesson_1;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        //Task_2.Вводится число n, затем n чисел целых, по одному на каждой строке.
        //Затем вводится число, на которое нужно умножить все введённые выше числа.
        //Выведите на экран результат умножения построчно.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел:");
        int col = scanner.nextInt();
        int[] arr = new int[col];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Введите число:");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите множитель:");
        int multiplier = scanner.nextInt();
        int[] newArr = new int[col];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i]*multiplier;
        }
        System.out.println("Результат:");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d * %d = %d\n", arr[i], multiplier, newArr[i] );
        }
    }

}
