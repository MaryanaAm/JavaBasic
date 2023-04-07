import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
    }
}
