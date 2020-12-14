package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
