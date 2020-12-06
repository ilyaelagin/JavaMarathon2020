package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2003, 70, 181000);
        Airplane airplane2 = new Airplane("Airbus", 2007, 44, 48100);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}