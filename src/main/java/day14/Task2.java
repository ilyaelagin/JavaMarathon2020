package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей. Реализовать статический метод
 * List<String> parseFileToStringList(File file), который считывает содержимое этого файла и возвращает список,
 * состоящий из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить
 * в консоль сообщение “Файл не найден”. Помимо этого, если значение возраста отрицательно, необходимо выбрасывать
 * исключение, выводить в консоль сообщение “Некорректный входной файл” и возвращать null или пустой список.
 *
 * Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
 *
 *
 * Пример содержания файла people.txt:
 * Mike 24
 * John 19
 * Anna 20
 * Miguel 5
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                int age = Integer.parseInt(people[1]);
                if (age < 0) {
                    list.clear();
                    throw new IOException();
                }
                list.add(line);
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
}
