import java.util.*;
public class Task_2 {
//    Реализовать алгоритм пирамидальной сортировки (HeapSort).
    public static void main(String[] args) {
        int[] arr = {12, 71, 13, 5, 46, 7, 80, 1000, -500};
        sort(arr);
        System.out.println(Arrays.toString(arr));
}
    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1; // Левый = 2*i + 1
        int right = 2 * i + 2; // Правый = 2*i + 2

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
