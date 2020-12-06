package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);
        Player.info();
        System.out.println("Количесвто игроков на поле: " + Player.countPlayers);
        Player player7 = new Player(random.nextInt(11) + 90);
        Player player8 = new Player(random.nextInt(11) + 90);
        Player.info();
        System.out.println("Количесвто игроков на поле: " + Player.countPlayers);

        for (int i = player1.MIN_STAMINA; i < player1.getStamina(); ) {
            player1.run();
        }
        Player.info();
    }
}