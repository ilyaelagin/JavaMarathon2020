package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker {" + "CountPickedOrders = " + warehouse.getCountPickedOrders() +
                ", salary = " + salary +
                ", isPayed = " + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000) {
            if (isPayed == false) {
                salary += 70000;
                isPayed = true;
                System.out.println("Собрано 10000 заказов. Сборщику выплачен бонус: 70000");
            } else {
                System.out.println("Бонус уже был выплачен");
            }
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
