package day11.task2;

public abstract class Hero implements PhysAttack, MagicAttack {
    public final int maxHealth = 100;
    public final int minHealth = 0;
    private int health;
    private int physAtt;
    private int magicAtt;
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

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
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
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() - (magicAtt - magicAtt * hero.magicDef / 100) <= minHealth) {
            hero.setHealth(minHealth);
        } else {
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.magicDef / 100));
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getHealth() - (physAtt - physAtt * hero.physDef / 100) <= minHealth) {
            hero.setHealth(minHealth);
        } else {
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.physDef / 100));
        }
    }
}
