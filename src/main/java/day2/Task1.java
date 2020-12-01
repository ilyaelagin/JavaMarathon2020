package day2;

import java.util.Scanner;

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