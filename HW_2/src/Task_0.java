import java.util.Scanner;
public class Task_0 {
    public static void main(String[] args) {
        // Посчитайте сколько драгоценных камней в куче обычных камней
        // Пример:
        // jewels = “aB”, stones = “aaaAbbbB”
        // Результат в консоль ”a3B1”
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stones: ");
        String stones = scanner.nextLine();
        System.out.println("Jewels: ");
        String jewels = scanner.nextLine();
        int char0 = 0;
        int char1 = 0;
        String[] newChar = jewels.split("");
        String[] newString = stones.split("");

        for (int i = 0; i < stones.length(); i++) {
            if (newString[i].contains(newChar[0])) {
                char0++;
            } else if (newString[i].contains(newChar[1])) {
                char1++;
            }

        }
        System.out.printf("%s%d%s%d", newChar[0], char0,newChar[1], char1);
    }
}
