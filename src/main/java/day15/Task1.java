package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
 * Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
 * в качестве разделителя использован символ “;”). В этом файле содержится информация о названии
 * модели обуви, ее размер и оставшееся на складе количество.
 *
 * До преобразования в csv это была таблица с тремя колонками:
 *
 * Название 						   Размер	   Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП			45		4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
 * ...
 *
 * Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях
 * и размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте программу,
 * которая принимает на вход csv файл и создает новый txt файл следующего содержания (должно получиться 11 строк):
 *
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 * ...
 */
public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File file1 = new File("src" + separator + "main" + separator + "resources" + separator + "shoes.csv");
        File file2 = new File("src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt");

        try (Scanner scanner = new Scanner(file1);
             PrintWriter printWriter = new PrintWriter(file2)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoeParameters = line.split(";");
                int quantity = Integer.parseInt(shoeParameters[2]);
                if (quantity == 0) {
                   String line2 = line.replace(";", ",");
                    printWriter.println(line2);
                }
            }
            System.out.println("Файл с отсутствующей на складе продукцией сформирован");
        } catch (FileNotFoundException e) {
            System.out.println("Message of Exception: " + e.getMessage());
        }
    }
}
