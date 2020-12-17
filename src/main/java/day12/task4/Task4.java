package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * *Выполнять в подпапке task4 в day12*
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в группу можно было добавлять и удалять
 * участников. Под участником понимается строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 * (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название метода: transferMembers.
 * Этот метод принимает в качестве аргументов два экземпляра класса MusicBand. В классе MusicBand, реализовать метод printMembers(),
 * печатающий список участников в консоль и метод getMembers(), возвращающий список участников.
 * Проверить состав групп после слияния.
 */
public class Task4 {
    public static void main(String[] args) {
        MusicBand musicBandA = new MusicBand("30 Seconds to Mars", 1998, new ArrayList<>(Arrays.asList(
                new String("Jared Leto"),
                new String("Shannon Leto"))));

        MusicBand musicBandB = new MusicBand("Sum 41", 1996, new ArrayList<>(Arrays.asList(
                new String("Deryck Whibley"),
                new String("Jason McCaslin"),
                new String("Tom Thacker"),
                new String("Dave Baksh"),
                new String("Frank Zummo"))));

        System.out.println(musicBandA);
        musicBandA.printMembers();
        System.out.println(musicBandB);
        musicBandB.printMembers();
        System.out.println("Составы после слияния групп:");
        MusicBand.transferMembers(musicBandA, musicBandB);
        musicBandA.printMembers();
        musicBandB.printMembers();
    }

}
