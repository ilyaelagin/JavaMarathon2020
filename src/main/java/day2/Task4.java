package day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
 * Для этого числа, по формуле выше, необходимо вычислить значение y и вывести его в консоль, используя метод System.out.println().
 * (Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно,
 * чтобы считать из консоли число x).
 *
 * *Пояснение.
 * Формула для вычисления значения y содержит две составляющие - набор выражений для вычисления значения y и условие,
 * при котором то или иное выражение “срабатывает”. Выполнение того или иного условия зависит от значения x.
 * Например, если x = 100, будет использовано самое первое выражение. С помощью него, используя значение x будет вычислено значение y.
 * y = (100^2 - 10) / (100 + 7) = 93.3644859813
 */
public class Task4 {
    public static void main(String[] args) {
        double y;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число х: ");
            double x = scanner.nextDouble();
            if (x >= 5) {
                y = (Math.pow(x, 2) - 10) / (x + 7);
            } else if (x > -3 && x < 5) {
                y = (x + 3) * (Math.pow(x, 2) - 2);
            } else {
                y = 420;
            }
            System.out.println("Значение у: " + y);
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное числовое значение");
        }
    }
}