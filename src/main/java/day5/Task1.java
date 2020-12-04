package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1979);
        car.setColor("blue");
        car.setModel("Fiesta");
        System.out.println(car.getYear() + " " + car.getModel() + " " + car.getColor());
    }
}