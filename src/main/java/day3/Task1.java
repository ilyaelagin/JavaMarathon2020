package day3;

import java.util.Scanner;

/**
 * Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
 * Программа должна работать до тех пор, пока не будет введено слово “Stop”.
 * Реализовать, используя следующие данные:
 * Москва, Владивосток, Ростов - Россия
 * Рим, Милан, Турин - Италия
 * Ливерпуль, Манчестер, Лондон - Англия
 * Берлин, Мюнхен, Кёльн - Германия
 *
 * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 *
 * Пример:
 * Милан - ваш ввод в консоль
 * Италия - ответ программы
 * Дублин - ваш ввод в консоль
 * Неизвестная страна - ответ программы
 * Stop - ваш ввод в консоль
 * *программа завершила работу*
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.matches("[а-яА-Яa-zA-z]+")) {
                String firstChar = line.substring(0, 1).toUpperCase(); // Делаем первую букву заглавной, на случай, если была введена прописная
                String otherChars = line.substring(1,line.length()).toLowerCase();
                line = firstChar + otherChars;
                if ("Stop".equals(line)) {
                    break;
                }
                switch (line) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кельн":
                        System.out.println("Германия");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                }
            } else {
                System.out.println("Введены недопустимые символы");
                continue;
            }
        }
        scanner.close();
    }
}