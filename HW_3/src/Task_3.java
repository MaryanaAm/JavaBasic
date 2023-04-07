import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        int summ = 0;
        for (int i = 0; i < list.size(); i++) {
            summ += list.get(i);
        }
        summ /= list.size();
        System.out.println("list: " + list);
        System.out.println("average = " + summ);
        System.out.println("min = " + Collections.min(list));
        System.out.println("max = " + Collections.max(list));
    }
}
