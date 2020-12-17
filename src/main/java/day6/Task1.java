package day6;

/**
 * Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня в пакет текущего дня.
 * В классах Автомобиль и Мотоцикл реализуйте два метода:
 * info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
 * yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает
 * разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
 *
 * В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
 */
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