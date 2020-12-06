package day7;

public class Player {
    private int stamina;
    public final int MAX_STAMINA = 100;
    public final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina -= 1;
            if (stamina == 0) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        switch (countPlayers) {
            case 1:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
                break;
            case 5:
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
                break;
            default:
                System.out.println("На поле нет свободных мест");
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}