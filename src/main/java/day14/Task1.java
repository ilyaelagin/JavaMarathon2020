package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
 * Заполнить его вручную десятью произвольными числами. Реализовать статический метод printSumDigits(File file),
 * который считает сумму всех чисел в этом файле и выводит ее на экран.
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 * Вызвать данный метод в методе main().
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try (Scanner scanner = new Scanner(file)) {

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length == 10) {
                int sum = 0;
                for (String number : numbersString) {
                    sum += Integer.parseInt(number);
                }
                System.out.println(sum);
            } else {
                throw new IOException();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            System.out.println("Файл содержит недопустимые символы");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
