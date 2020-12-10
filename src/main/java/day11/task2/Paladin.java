package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        setHealth(100);
        setPhysAtt(15);
        setPhysDef(50);
        setMagicDef(20);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 10 >= maxHealth) {
            hero.setHealth(100);
        } else {
            hero.setHealth(hero.getHealth() + 30);
        }
    }


    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + getHealth() +
                '}';
    }
}
