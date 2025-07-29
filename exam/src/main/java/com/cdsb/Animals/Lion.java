package com.cdsb.Animals;

public class Lion extends Mammal {
    public Lion() {
        super("Lion", 500.0, DietType.CARNIVORE, HabitatType.TERRESTRIAL);
    }

    @Override
    public BehaviorType getBehavior() {
        return BehaviorType.TERRITORIAL;
    }

    @Override
    public Compatibility getCompatibility(Animal other) {
        if (other instanceof Elephant || other instanceof Zebra) {
            return Compatibility.INCOMPATIBLE;
        }
        return Compatibility.UNKNOWN;
    }
}


