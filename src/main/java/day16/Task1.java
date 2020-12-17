package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами  и в качестве ответа
 * выводит в консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом.
 * В консоль необходимо вывести полную запись вещественного числа (со всеми знаками после запятой)
 * и сокращенную запись (с 3 знаками после запятой).
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("test16.txt");

        printResult(file);
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            double average = (double) sum / numbersString.length;
            System.out.print(average + " --> " + new DecimalFormat(".000").format(average) + "\n");

            // Как было в решении
            System.out.printf(average + " --> %.3f", average);

        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Message exception: " + e.getMessage());
        }
    }
}
