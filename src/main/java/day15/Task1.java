package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

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
                    printWriter.println(line);
                }
            }
            System.out.println("Файл с отсутствующей на складе продукцией сформирован");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
