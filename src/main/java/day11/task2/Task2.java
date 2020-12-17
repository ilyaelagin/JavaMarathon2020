package day11.task2;

import day11.task2.model.Magician;
import day11.task2.model.Paladin;
import day11.task2.model.Shaman;
import day11.task2.model.Warrior;

/**
 * В соответствии с таблицей ниже реализовать классы персонажей и необходимые интерфейсы.
 * Пояснения к таблице:
 * В колонке “Герой” - названия классов героев, которые должны быть реализованы. Все классы наследуются от абстрактного класса Hero.
 * Тип атаки, которую может наносить герой: “Ф” - физическая атака (physAtt), “М” - магическая атака (magicAtt).
 * Защита героя от физических и магических атак: Ф 80% - поглощение 80% физического урона, например при Ф атаке на 100 единиц,
 * героем будет получен урон лишь 20 единиц. Для М атаки - аналогично.
 * Лечение: healHimself() - персонаж лечит себя на указанное количество единиц, healTeammate(Hero hero) - персонаж лечит
 * союзника на указанное количество единиц, “нет” - персонаж не имеет способности лечить кого-либо.
 * Максимальное здоровье любого Героя - 100, минимальное - 0.
 * Обратите внимание!
 * Значения защиты в процентах, а другие параметры в единицах, т.е. атаковав воина типом Ф 10, он получит урон не 10,
 * а 2 ед. урона (10 - 10*0.8 = 2)
 *
 * Необходимые интерфейсы и их сигнатуры:
 * Лечение - interface Healer.
 * Сигнатуры: healHimself(), healTeammate(Hero hero)
 *
 * Физическая атака - interface PhysAttack.
 * Сигнатура: physicalAttack(Hero hero)
 *
 * Магическая атака - interface MagicAttack.
 * Сигнатура: magicalAttack(Hero hero)
 *
 * Каждый класс-герой должен иметь:
 * Поля
 * health (здоровье)
 * physDef (процент поглощения физического урона)
 * magicDef (процент поглощения магического урона)
 * physAtt (величина физической атаки), по необходимости
 * magicAtt (величина магической атаки), по необходимости
 * Реализацию необходимых интерфейсов
 * Переопределенный toString()
 *
 * Каждый герой должен обладать только теми способностями, которые ему доступны. Например, Воин не может лечить, значит в классе Воин
 * не реализуется интерфейс Healer, соответственно запись warrior.healHimself() является недопустимой.
 * Параметры для героя задаются внутри конструктора, при этом сам конструктор не должен принимать аргументов.
 *
 * После того, как все классы будут реализованы, в методе main() класса Task2 последовательно выполните следующие действия,
 * проверяя показатель здоровья у персонажа, на которого направлено действие:
 * Воин атакует Паладина
 * Паладин атакует Мага
 * Шаман лечит Мага
 * Маг атакует Паладина, тип атаки М
 * Шаман атакует Воина, тип атаки Ф
 * Паладин лечит себя
 * Воин атакует Мага 5 раз
 *
 * Результат в консоли:
 * Paladin{health=85}
 * Magician{health=85}
 * Magician{health=100}
 * Paladin{health=69}
 * Warrior{health=98}
 * Paladin{health=94}
 *
 * Magician{health=70}
 * Magician{health=40}
 * Magician{health=10}
 * Magician{health=0}
 * Magician{health=0}
 */
public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician);
        }
    }
}
