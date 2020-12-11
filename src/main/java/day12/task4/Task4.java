package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

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
