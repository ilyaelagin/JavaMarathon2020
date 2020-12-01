package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double y;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число х: ");
            double x = scanner.nextDouble();
            if (x >= 5) {
                y = (Math.pow(x, 2) - 10) / (x + 7);
                System.out.println("Значение у: " + y);
            } else if (x > -3 && x < 5) {
                y = (x + 3) * (Math.pow(x, 2) - 2);
                System.out.println("Значение у: " + y);
            } else {
                y = 420;
                System.out.println("Значение у: " + y);
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное числовое значение");
        }
    }
}