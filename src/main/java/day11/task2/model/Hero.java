package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;
    private int health;
    private int physAtt;
    private int physDef;
    private int magicDef;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        int checkHeroHealth = hero.getHealth() - (physAtt - physAtt * hero.physDef / 100);
        if (checkHeroHealth < MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        } else {
            hero.setHealth(checkHeroHealth);
        }
    }
}
