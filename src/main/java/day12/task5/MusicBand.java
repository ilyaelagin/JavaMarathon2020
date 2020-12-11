package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> musicArtists;

    public MusicBand(String name, int year, List<MusicArtist> musicArtists) {
        this.name = name;
        this.year = year;
        this.musicArtists = musicArtists;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getBandMember() {
        return musicArtists;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        bandB.musicArtists.addAll(bandA.getBandMember());
        bandA.musicArtists.removeAll(bandA.getBandMember());
    }

    public void printMembers() {
        System.out.println(musicArtists);
    }

    public List<MusicArtist> getMembers() {
        return musicArtists;
    }

    @Override
    public String toString() {
        return "MusicBand {" +
                "name = " + name +
                ", year = " + year +
                '}';
    }
}
