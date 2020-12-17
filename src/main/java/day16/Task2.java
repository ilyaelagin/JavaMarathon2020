package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
 * Оба файла должны находиться в корне проекта. Создаваться файлы должны не вручную, а при запуске программы.
 * Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое.
 * Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо реализовать статический метод printResult(File file).
 * Этот метод должен рассчитать сумму всех вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную часть.
 */
public class Task2 {
    public static void main(String[] args) {
        try (PrintWriter printWriterFile1 = new PrintWriter("file1.txt");
             PrintWriter printWriterFile2 = new PrintWriter("file2.txt")) {
            Random random = new Random();
            for (int i = 0; i < 50; i++) {
                double sum = 0;
                for (int j = 0; j < 20; j++) {
                    int num = random.nextInt(100);
                    printWriterFile1.print(num + " ");
                    sum += num;
                }
                printWriterFile2.print(sum / 20 + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Message of Exception: " + e.getMessage());
        }

        printResult(new File("file2.txt"));
    }

    public static void printResult(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            double sum = 0;
            for (String number : numbersString) {
                sum += Double.parseDouble(number);
            }
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Message of Exception: " + e.getMessage());
        }
    }
}
