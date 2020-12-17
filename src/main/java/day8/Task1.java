package day8;

/**
 * Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка,
 * полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 * После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
 *
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией
 * обычных строк (класс String) и использовании StringBuilder, реализуйте описанную задачу этими двумя способами,
 * замеряя время работы программы.
 */
public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <= 20000; i++) {
            string = string + i + " ";
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("Время работы, используя String: " + timeConsumedMillis1);

        long start2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println("Время работы, используя StringBuilder: " + timeConsumedMillis2);
    }

}