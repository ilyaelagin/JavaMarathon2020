package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

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
                int[] numbers = new int[10];
                int count = 0;
                for (String number : numbersString) {
                    numbers[count++] = Integer.parseInt(number);
                }
                int sum = Arrays.stream(numbers).sum();
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
