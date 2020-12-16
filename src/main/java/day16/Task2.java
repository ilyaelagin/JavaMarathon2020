package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

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
