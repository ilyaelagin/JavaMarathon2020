package day4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(11);
            }

            System.out.println(Arrays.toString(arr));
            System.out.println("Длина массива: " + arr.length);

            int moreEight = 0;
            int equalsOne = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 8) {
                    moreEight++;
                } else if (arr[i] == 1) {
                    equalsOne++;
                }
            }
            System.out.println("Количество чисел больше 8: " + moreEight);
            System.out.println("Количество чисел равных 1: " + equalsOne);

            int evenNumbers = 0;
            int oddNumbers = 0;
            for (int element : arr) {
                if (element % 2 == 0) {
                    evenNumbers++;
                } else {
                    oddNumbers++;
                }
            }
            System.out.println("Количество четных чисел: " + evenNumbers);
            System.out.println("Количество нечетных чисел: " + oddNumbers);

            int sum = 0;
            for(int element : arr) {
                sum += element;
            }
            System.out.println("Сумма всех элементов массива: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Недопустимые символы или размер массива");
        } catch (NegativeArraySizeException e) {
            System.out.println("Отрицательный размер массива недопускается");
        }
    }

}