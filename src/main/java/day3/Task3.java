package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                if (y == 0) {
                    System.out.println("Деление на 0");
                    continue;
                }
                System.out.println(x / y);
            }
        } catch (InputMismatchException e) {
            System.out.println("Некорректное число");
        }
    }
}