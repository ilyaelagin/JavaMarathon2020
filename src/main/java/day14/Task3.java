package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод
 * List<Person> parseFileToObjList(File file), который считывает содержимое того же файла people.txt,
 * создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в методе main()
 * и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно,
 * необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 *
 *
 * Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]
 */
public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                String name = people[0];
                int year = Integer.parseInt(people[1]);

                if (year < 0) {
                    list.clear();
                    throw new IOException();
                }
                list.add(new Person(name, year));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberFormatException e) {
            list.clear();
            System.out.println("В файле есть человек с ошибкой в возрасте");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return list;
    }

    static class Person {
        private String name;
        private int year;

        public Person(String name, int age) {
            this.name = name;
            this.year = age;
        }

        @Override
        public String toString() {
            return "{" + "name='" + name + '\'' + ", year=" + year + '}';
        }
    }
}
