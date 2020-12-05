package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2003, 70, 181000);
        airplane.setYear(2008);
        airplane.setLength(76);
        airplane.fillUp(130_000);
        airplane.fillUp(20_000);
        airplane.info();
    }
}