package day2;

import java.util.Scanner;

/**
 * Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
 * Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
 * но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие
 * (делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие
 * (делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
 * Если a >= b вывести сообщение "Некорректный ввод".
 *
 * Пример:
 * Вводим в консоли: 7 78
 * Вывод: 15 25 35 45 55 65 75
 *
 * *Для получения из консоли двух чисел, разделенных пробелом, можно использовать метод nextInt() вызвав его дважды.
 */
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