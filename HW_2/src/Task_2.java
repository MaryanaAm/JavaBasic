import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Универс. решение

        //ввод всех необходимых данных
        System.out.print("Количество рецептов = ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Внесите рецепт: ");
        String[] book = new String[n];
        for (int i = 0; i < n; i++) {
            book[i] = scanner.nextLine();
        }

        System.out.print("Количество продуктов-аллергенов = ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Аллерген - замена: ");
        String[][] allergens = new String[m][2];
        for (int i = 0; i < m; i++) {
            String[] pair = scanner.nextLine().split(" - ");
            allergens[i][0] = pair[0];
            allergens[i][1] = pair[1];
        }
        //делим на отдельные слова
        String[][] recipes = new String[n][];
        for (int i = 0; i < n; i++) {
            recipes[i] = book[i].split(" ");
        }
        //поиск и замена
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < recipes[i].length; j++) {
                for (String[] allergen : allergens) {
                    if (recipes[i][j].equalsIgnoreCase(allergen[0])) {
                        if(Character.isUpperCase(recipes[i][j].charAt(0))) {
                            recipes[i][j] = allergen[1].substring(0, 1).toUpperCase() + allergen[1].substring(1);
                        }
                        else{
                            recipes[i][j] = allergen[1].toLowerCase();
                        }
                    }
                }
            }
        }
        // склеиваем слова и снова делаем массив из двух строк
        String[] newRecipes = new String[n];
        for (int i = 0; i < n; i++) {
            newRecipes[i] = String.join(" ", recipes[i]);
            System.out.println(newRecipes[i]);
        }

//        Неуниверсальное решение

//        Scanner scanner = new Scanner(System.in);
//        // количество строк
//        System.out.print("Количество рецептов = ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//
//        // строки
//        System.out.print("Внесите рецепт: ");
//        String[] book = new String[n];
//        for (int i = 0; i < n; i++) {
//            book[i] = scanner.nextLine();
//        }
//        //два массива с словами
//        String[] book1 = book[0].split(" ");
//        String[] book2 = book[1].split(" ");
//
//        // количество продуктов
//        System.out.print("Количество продуктов-аллергенов = ");
//        int m = scanner.nextInt();
//        scanner.nextLine();
//        //строки продуктов и заменителей
//        System.out.print("Аллерген - замена: ");
//        String[][] allergens = new String[m][2];
//        for (int i = 0; i < m; i++) {
//            String[] pair = scanner.nextLine().split(" - ");
//            allergens[i][0] = pair[0];
//            allergens[i][1] = pair[1];
//        }
//        //поиск в первом массиве
//        for (int i = 0; i < book1.length; i++) {
//            for (int k = 0; k < allergens.length; k++) {
//                if (book1[i].equalsIgnoreCase(allergens[k][0])) {
//                    book1[i] = allergens[k][1];
//                }
//            }
//
//        }
//        //поиск во втором массиве
//        for (int j = 0; j < book2.length; j++) {
//            for (int k = 0; k < allergens.length; k++) {
//                if (book2[j].equalsIgnoreCase(allergens[k][0])) {
//                    book2[j] = allergens[k][1];
//                }
//            }
//        }
//        //превращаем массива в строкия
//        String newStr = String.join(" ", book1);
//        String newStr2 = String.join(" ", book2);
//        System.out.println(newStr);
//        System.out.println(newStr2);
    }
}
