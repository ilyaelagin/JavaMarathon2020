package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private static final int TASK_SALARY = 100;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
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
        salary += TASK_SALARY;
        warehouse.incrementDeliveredOrders();
    }

    // Более лаконичное написание метода bonus()
    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
        System.out.println("Доставлено 10000 заказов. Курьеру выплачен бонус: 50000");
    }

}
