package day11.task2.model;

public class Warrior extends Hero {

    public Warrior() {
        setHealth(100);
        setPhysAtt(30);
        setPhysDef(80);
        setMagicDef(0);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }
}
