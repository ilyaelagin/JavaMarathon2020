package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите 2 числа, в диапазоне которых, числа делятся на 5 без остатка, но при этом не делятся на 10 без остатка (не включительно): ");
            System.out.print("Первое число: ");
            String line1 = scanner.nextLine().trim();
            System.out.print("Второе число: ");
            String line2 = scanner.nextLine().trim();

            if (validationCheck(line1) && validationCheck(line2)) {
                int a = Integer.parseInt(line1);
                int b = Integer.parseInt(line2);
                if (a >= b) {
                    System.out.println("Некорректный ввод");
                } else if (a == b - 1) {
                    System.out.println("В этом диапазоне таких чисел нет");
                } else {
                    for (int i = a + 1; i < b; i++) {
                        if (i % 5 == 0 && i % 10 != 0)
                            System.out.print(i + " ");
                    }
                }
            } else {
                System.out.println("Некорректный формат числа");
            }
        } catch (NumberFormatException e) {
            System.out.println("Не соответствует диапазон допустимых значений переменной");
        }
    }

    public static boolean validationCheck(String line) {
        boolean check = line.matches("-?\\d+");
        return check;
    }
}