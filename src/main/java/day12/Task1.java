package day12;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ford");
        list.add("Toyota");
        list.add("Nissan");
        list.add("Skoda");
        list.add("Bmw");
        System.out.println(list);

        list.add(3, "Kia");
        list.remove(0);
        System.out.println(list);
    }
}
