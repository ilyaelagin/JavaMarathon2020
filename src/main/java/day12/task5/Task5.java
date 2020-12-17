package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  *Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
 * но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
 * чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось
 * в 4 задании - слить две группы и проверить состав групп после слияния. Методы для слияния и для вывода участников
 * в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
 */
public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBandA = new MusicBand("30 Seconds to Mars", 1998, new ArrayList<>(Arrays.asList(
                new MusicArtist("Jared Leto", 48),
                new MusicArtist("Shannon Leto", 50))));

        MusicBand musicBandB = new MusicBand("Sum 41", 1996, new ArrayList<>(Arrays.asList(
                new MusicArtist("Deryck Whibley", 40),
                new MusicArtist("Jason McCaslin", 40),
                new MusicArtist("Tom Thacker", 46),
                new MusicArtist("Dave Baksh", 40),
                new MusicArtist("Frank Zummo", 42))));

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
