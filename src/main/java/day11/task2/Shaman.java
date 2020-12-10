package day11.task2;

public class Shaman extends Hero implements Healer {

    public Shaman() {
        setHealth(100);
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysDef(20);
        setMagicDef(20);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 30 >= maxHealth) {
            hero.setHealth(100);
        } else {
            hero.setHealth(hero.getHealth() + 30);
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + getHealth() +
                '}';
    }
}
