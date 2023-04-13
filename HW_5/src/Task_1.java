import java.util.*;
public class Task_1 {
    //    Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//    Пусть дан список сотрудников: ...
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//    Отсортировать по убыванию популярности.

    public static void main(String[] args) {
        // создаем телефонную книгу в виде HashMap
        Map<String, String[]> phoneBook = new HashMap<>();

// Заполняем HashMap данными о сотрудниках
        phoneBook.put("Иван Иванов", new String[]{"555-1234", "555-5678"});
        phoneBook.put("Светлана Петрова", new String[]{"555-2345"});
        phoneBook.put("Кристина Белова", new String[]{"555-3456"});
        phoneBook.put("Анна Мусина", new String[]{"555-4567"});
        phoneBook.put("Анна Крутова", new String[]{"555-5678"});
        phoneBook.put("Иван Юрин", new String[]{"555-6789"});
        phoneBook.put("Петр Лыков", new String[]{"555-7890"});
        phoneBook.put("Павел Чернов", new String[]{"555-8901"});
        phoneBook.put("Петр Чернышов", new String[]{"555-9012"});
        phoneBook.put("Мария Федорова", new String[]{"555-0123"});
        phoneBook.put("Марина Светлова", new String[]{"555-1234"});
        phoneBook.put("Мария Савина", new String[]{"555-2345"});
        phoneBook.put("Мария Рыкова", new String[]{"555-3456"});
        phoneBook.put("Марина Лугова", new String[]{"555-4567"});
        phoneBook.put("Анна Владимирова", new String[]{"555-5678"});
        phoneBook.put("Иван Мечников", new String[]{"555-6789"});
        phoneBook.put("Петр Петин", new String[]{"555-7890"});
        phoneBook.put("Иван Ежов", new String[]{"555-8901"});

// Создаем HashMap для хранения количества повторений каждого имени
        Map<String, Integer> nameCounts = new HashMap<>();

// Перебираем всех сотрудников в телефонной книге
        for (String name : phoneBook.keySet()) {
            // Получаем список телефонов для данного сотрудника
            String[] phones = phoneBook.get(name);
            // Получаем имя, не учитывая фамилию
            String firstName = name.split(" ")[0];
//            // Перебираем все телефоны и выводим их на экран
//            for (String phone : phones) {
//                System.out.println(firstName);
//            }
            // Проверяем, было ли имя уже добавлено в HashMap nameCounts
            if (nameCounts.containsKey(firstName)) {
                int count = nameCounts.get(firstName);
                // Если да, увеличиваем значение счетчика на 1
                nameCounts.put(firstName, count + 1);
            } else {
                // Если нет, добавляем имя в HashMap nameCounts со значением 1
                nameCounts.put(firstName, 1);
            }
        }


// Создаем массив для хранения имен, отсортированных по убыванию популярности
        String[] sortedNames = new String[nameCounts.size()];
        int index = 0;
        for (String name : nameCounts.keySet()) {
            sortedNames[index] = name;
            index++;
        }
        for (int i = 0; i < sortedNames.length - 1; i++) {
            for (int j = i + 1; j < sortedNames.length; j++) {
                if (nameCounts.get(sortedNames[i]) < nameCounts.get(sortedNames[j])) {
                    String temp = sortedNames[i];
                    sortedNames[i] = sortedNames[j];
                    sortedNames[j] = temp;
                }
            }
        }

// Выводим на экран повторяющиеся имена и их количество повторений
        for (String name : sortedNames) {
            int count = nameCounts.get(name);
            if (count > 0) {
                System.out.println(name + " - " + count);
            }
        }

    }
}


