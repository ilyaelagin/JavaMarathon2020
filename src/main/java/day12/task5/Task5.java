package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

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
