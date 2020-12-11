package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> bandMember;

    public MusicBand(String name, int year, List<String> bandMember) {
        this.name = name;
        this.year = year;
        this.bandMember = bandMember;
    }

    public int getYear() {
        return year;
    }

    public List<String> getBandMember() {
        return bandMember;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        bandB.bandMember.addAll(bandA.getBandMember());
        bandA.bandMember.removeAll(bandA.getBandMember());
    }

    public void printMembers() {
        System.out.println(bandMember);
    }

    public List<String> getMembers() {
        return bandMember;
    }

    @Override
    public String toString() {
        return "MusicBand {" +
                "name = " + name +
                ", year = " + year +
                '}';
    }
}
