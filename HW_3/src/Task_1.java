import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализовать алгоритм сортировки слиянием и выборкой.
//(Самое эффективное , это изучить эти сортировки на Питоне , и постараться написать их на java)
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        int n = list.size();
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(list.get(j) < list.get(minIndex)){
                    minIndex = j;
                }
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
                }
            }
        System.out.println(list);
        }

    }

