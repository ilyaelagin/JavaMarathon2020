package day12;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0) {
                list.add(i);
                if (i == 30) {
                    i = 299;
                }
            }
        }
        System.out.println(list);
    }
}
