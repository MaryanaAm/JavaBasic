import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

        Scanner scanner = new Scanner(System.in);
        System.out.println("String = ");
        final String s = scanner.nextLine();
        final int [] index = new int[s.length()];
        for (int i = 0; i < index.length; i++) {
            System.out.println("Array idx = ");
            index[i] = scanner.nextInt();
        }
        String result = shuffle(s, index);
        System.out.println(result);

    }
    public static String shuffle (final String s, final int[] index){
        char[] chars = s.toCharArray();
        int[] indexes = index.clone();
        char[] ch = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ch[indexes[i]-1] = chars[i];
        }
        String result = new String(ch);
        return result;
    }
}
