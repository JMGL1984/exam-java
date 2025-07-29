package com.cdsb.Animals;

public class Zebra extends Mammal {
    public Zebra() {
        super("Zebra", 300.0, DietType.HERBIVORE, HabitatType.TERRESTRIAL);
    }

    @Override
    public BehaviorType getBehavior() {
        return BehaviorType.SOCIAL;
    }

    @Override
    public Compatibility getCompatibility(Animal other) {
        if (other.getName().equals("Elephant") || other.getName().equals("Zebra")) {
            return Compatibility.COMPATIBLE;
        } else if (other.getName().equals("Lion")) {
            return Compatibility.INCOMPATIBLE;
        }
        return null ;
    }
}
