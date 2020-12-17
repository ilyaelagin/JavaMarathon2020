package day2;

import java.util.Scanner;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
 * соответствующее количеству этажей в здании. Используя условный оператор if,
 * необходимо вывести в консоль сообщение о типе такого дома.
 *
 * Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
 * Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите этаж (начиная с 1го): ");
            String line = scanner.nextLine().trim();
            if (line.matches("-?\\d+")) {
                int number = Integer.parseInt(line);
                if (number > 0 && number < 5) {
                    System.out.println("Малоэтажный дом");
                } else if (number > 4 && number < 9) {
                    System.out.println("Среднеэтажный дом");
                } else if (number >= 9) {
                    System.out.println("Многоэтажный дом");
                } else {
                    System.out.println("Ошибка ввода");
                }
            } else {
                System.out.println("Введен нечисловой номер этажа");
            }
        } catch (NumberFormatException e) {
            System.out.println("Не соответствует диапазон допустимых значений переменной");
        }
    }
}