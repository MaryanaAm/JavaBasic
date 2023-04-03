import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SyncFailedException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_3 {
    //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
    //Требуется перехватить все возможные ошибки и вывести их в логгер.
    //
    //После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
    private static final Logger LOGGER = Logger.getLogger(Task_3.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число в формате byte: ");
        byte number = 0;
        try {
//          while (!scanner.hasNextByte()){
//               System.out.println("Неверный формат ввода!");
//               System.out.print("Введите число в формате byte: ");
//               scanner.nextLine();
//          }
            number = scanner.nextByte();
        } catch (InputMismatchException e){
            LOGGER.log(Level.SEVERE, "ошибка ввода: " + e.getMessage(), e);
            return;
        }finally {
            scanner.close();
        }
        scanner.close();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\OS ( D )\\Java\\JavaBasic\\HW_2\\src\\result.txt", true))) {
            writer.write(Byte.toString(number));
            writer.write(System.getProperty("line.separator"));
            System.out.println("Успешно!");
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Ошибка записи в файл: " + e.getMessage(), e);
        }
    }
}

//
////      Нахождение абсолютного пути файла
////      String pathProject = System.getProperty("user.dir");
////      String pathFile = pathProject.concat("result.txt");
////      File f = new File(pathFile);
////      System.out.println(f.getAbsolutePath());
//        try(FileWriter writer = new FileWriter("C:\\OS ( D )\\Java\\JavaBasic\\HW_2\\src\\result.txt", false))
//        {
//            byte num = scanner.nextByte();
//            // запись всей строки
////            String text = "Hello Gold!";
//            writer.write(num);
//            // запись по символам
////            writer.append('\n');
////            writer.append('E');
//
//            writer.flush();
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//        BufferedReader br = null;
//        try {
//            File file = new File("C:\\OS ( D )\\Java\\JavaBasic\\HW_2\\src\\result.txt");
//            if(!file.exists()){
//                file.createNewFile();
//            }
//            PrintWriter pw = new PrintWriter(file);
//            pw.println("Уиииииииииии");
//            pw.close();
//
//            br = new BufferedReader(new FileReader("C:\\OS ( D )\\Java\\JavaBasic\\HW_2\\src\\result.txt"));
//            String line;
//            while ((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e){
//            System.out.print("Error: " + e);
//        } finally {
//            try {
//                assert br != null;
//                br.close();
//            } catch (IOException e) {
//                System.out.print("Error: " + e);
//            }
//        }
//
