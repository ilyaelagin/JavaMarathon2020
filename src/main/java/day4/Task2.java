package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести в консоль:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 *
 * Использовать сортировку запрещено.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000);
        }
        int max = arr[0];
        int min = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            } else if (element < min) {
                min = element;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);

        int elementsEndZero = 0;
        int sumElementsEndingZero = 0;
        for (int element : arr) {
            if(element %10 == 0) {
                elementsEndZero++;
                sumElementsEndingZero += element;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + elementsEndZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumElementsEndingZero);
    }
}