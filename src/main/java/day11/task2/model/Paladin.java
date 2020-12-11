package day11.task2.model;

import day11.task2.interfaces.Healer;

public class Paladin extends Hero implements Healer {
    private static final int HEAL_AMOUNT = 25;
    private static final int HEAL_TEAMMATE_AMOUNT = 10;

    public Paladin() {
        setHealth(100);
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
    }

    @Override
    public void healHimself() {
        int checkHealth = getHealth() + HEAL_AMOUNT;
        if (checkHealth > MAX_HEALTH) {
            setHealth(MAX_HEALTH);
        } else {
            setHealth(checkHealth);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        int checkHeroHealth = hero.getHealth() + HEAL_TEAMMATE_AMOUNT;
        if (checkHeroHealth > MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
        } else {
            hero.setHealth(checkHeroHealth);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
