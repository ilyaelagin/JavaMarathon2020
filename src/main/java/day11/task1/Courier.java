package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Courier {" + "CountDeliveredOrders = " + warehouse.getCountDeliveredOrders() +
                ", salary = " + salary +
                ", isPayed = " + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(1);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() >= 10000) {
            if(isPayed == false) {
                salary += 50000;
                isPayed = true;
                System.out.println("Доставлено 10000 заказов. Курьеру выплачен бонус: 50000");
            } else {
                System.out.println("Бонус уже был выплачен");
            }
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
