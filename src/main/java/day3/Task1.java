package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.matches("[а-яА-Яa-zA-z]+")) {
                String firstChar = line.substring(0, 1).toUpperCase(); // Делаем первую букву заглавной, на случай, если была введена прописная
                line = firstChar + line.substring(1, line.length());
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
                    case "Stop":
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                }
                if ("Stop".equals(line)) {
                    break;
                }
            } else {
                System.out.println("Введены недопустимые символы");
                continue;
            }
        }
        scanner.close();
    }
}