import java.io.IOException;
import java.util.*;
import java.util.logging.*;


public class Task_5 {
    private  static final Logger logger = Logger.getLogger(Task_5.class.getName());
    public static void main(String[] args) throws IOException {
        // 	Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
        Scanner scanner = new Scanner(System.in);
        int result;
        char operator;
        System.out.println("Введите целое положительное число:");
        System.out.println("Введите число 1: ");
        while (!scanner.hasNextInt()) {
            logger.warning("Ошибка ввода! Неверный формат числа.");
            System.out.print("Введите число 1: ");
            scanner.nextLine();
        }
        int a = scanner.nextInt();
        //IntelliJ IDEA сама заменила мою конструкцию while с if/else на do while
        do {
            System.out.println("Выберите действие: (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            if((operator != '+' && operator != '-' && operator != '*' && operator != '/')){
                logger.warning("Ошибка ввода! Неверный символ.");
                System.out.println("Введите корректный символ"); // вывод сообщения об ошибке
            }

        } while (operator != '+' && operator != '-' && operator != '*' && operator != '/');

        System.out.println("Введите число 2: ");
        while (!scanner.hasNextInt()) {
            logger.warning("Ошибка ввода! Неверный формат числа.");
            System.out.print("Введите число 2: ");
            scanner.nextLine();
        }
        int b = scanner.nextInt();

        //IntelliJ IDEA также предлажила более компактный вариант записи без break;
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> {
                logger.severe("Ошибка! Некорректная операция.");
                System.out.println("error");
                return;
            }
        }
        logger.info(String.format("%d %c %d = %d", a, operator, b, result));
        System.out.printf("%d %c %d = %d", a, operator, b, result);

//        ConsoleHandler info = new ConsoleHandler();
        FileHandler fh = new FileHandler("C:\\OS ( D )\\Java\\JavaBasic\\HW_2\\src\\log.txt");
//        logger.addHandler(info);
        logger.addHandler(fh);
        logger.setLevel(Level.INFO);
        SimpleFormatter sFormat = new SimpleFormatter();
//        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
//        fh.setFormatter(xml);
        fh.close();


    }
}

