package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private int magicAtt;

    public Shaman() {
        magicAtt = 15;
        setHealth(100);
        setPhysAtt(10);
        setPhysDef(20);
        setMagicDef(20);
    }

    @Override
    public void healHimself() {
        if (getHealth() + 50 >= MAX_HEALTH) {
            setHealth(100);
        } else {
            setHealth(getHealth() + 50);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 30 >= MAX_HEALTH) {
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

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef() / 100) <= MIN_HEALTH) {
            hero.setHealth(MIN_HEALTH);
        } else {
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef() / 100));
        }
    }
}
