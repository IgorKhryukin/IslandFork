package ru.javarush.island.vlasov.entity;

import java.util.HashMap;

public class Boa extends Predator {
    private final HashMap<String, Integer> CHANCE_TO_EAT = new HashMap<>();

    public Boa() {
        super(15, 30, 1, 3);
        CHANCE_TO_EAT.put(Bear.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Boar.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Buffalo.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Caterpillar.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Deer.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Duck.class.getCanonicalName(), 10);
        CHANCE_TO_EAT.put(Eagle.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Fox.class.getCanonicalName(), 15);
        CHANCE_TO_EAT.put(Goat.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Horse.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Mouse.class.getCanonicalName(), 40);
        CHANCE_TO_EAT.put(Plant.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Rabbit.class.getCanonicalName(), 20);
        CHANCE_TO_EAT.put(Sheep.class.getCanonicalName(), 0);
        CHANCE_TO_EAT.put(Wolf.class.getCanonicalName(), 0);
    }

    public HashMap<String, Integer> getChanceToEat() {
        return CHANCE_TO_EAT;
    }

    @Override
    public Nature getInstance() {
        return new Boa();
    }

    @Override
    public String toString() {
        return "Boa";
    }
}
