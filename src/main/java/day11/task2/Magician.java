package day11.task2;

public class Magician extends Hero {

    public Magician() {
        setHealth(100);
        setPhysAtt(5);
        setMagicAtt(20);
        setPhysDef(0);
        setMagicDef(80);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + getHealth() +
                '}';
    }
}
