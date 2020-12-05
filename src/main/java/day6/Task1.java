package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1979);
        car.setColor("blue");
        car.setModel("Fiesta");
        car.info();
        System.out.println(car.yearDifference(2020));

        Motorbike motorbike = new Motorbike("Hayabusa", "black", 2017);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2010));
    }
}