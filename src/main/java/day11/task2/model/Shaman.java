package day11.task2.model;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    private int magicAtt;
    private static final int HEAL_AMOUNT = 50;
    private static final int HEAL_TEAMMATE_AMOUNT = 30;

    public Shaman() {
        magicAtt = 15;
        setHealth(100);
        setPhysAtt(10);
        setPhysDef(20);
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
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        int checkHeroHealth = hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef() / 100);
        if (checkHeroHealth < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        } else {
            hero.setHealth(checkHeroHealth);
        }
    }
}
