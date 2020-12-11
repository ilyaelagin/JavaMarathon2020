package day11.task2.model;

import day11.task2.interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        magicAtt = 20;
        setHealth(100);
        setPhysAtt(5);
        setPhysDef(0);
        setMagicDef(80);
    }

    @Override
    public String toString() {
        return "Magician{" +
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
