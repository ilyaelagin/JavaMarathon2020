package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * *Выполнять в подпапке task3 в day12*
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand , добавить их в список (выбирайте такие музыкальные группы, которые
 * были созданы как до 2000 года, так и после, жанр не важен). Перемешать список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после
 * 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
 * Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
 */
public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();

        MusicBand musicBand1 = new MusicBand("Linkin park", 1996);
        MusicBand musicBand2 = new MusicBand("30 Seconds to Mars", 1998);
        MusicBand musicBand3 = new MusicBand("Nirvana", 1987);
        MusicBand musicBand4 = new MusicBand("Sum 41", 1996);
        MusicBand musicBand5 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand6 = new MusicBand("Metallica", 1981);
        MusicBand musicBand7 = new MusicBand("Red Hot Chili Peppers", 1983);
        MusicBand musicBand8 = new MusicBand("The Killers", 2001);
        MusicBand musicBand9 = new MusicBand("Franz Ferdinand", 2002);
        MusicBand musicBand10 = new MusicBand("OneRepublic", 2002);

        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        Collections.shuffle(musicBandList);

        System.out.println(musicBandList);
        System.out.println(groupsAfter2000(musicBandList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandAfter2000List = new ArrayList<>();
        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() > 2000) {
                musicBandAfter2000List.add(musicBand);
            }
        }
        return musicBandAfter2000List;
    }
}
