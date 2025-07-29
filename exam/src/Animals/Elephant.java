package animals;

import enums.*;

public class Elephant extends Mammal {
    public Elephant() {
        super("Elephant", 700.0, DietType.HERBIVORE, HabitatType.TERRESTRIAL);
    }

    @Override
    public BehaviorType getBehavior() {
        return BehaviorType.SOCIAL;
    }

    @Override
    public Compatibility getCompatibility(Animal other) {
        if (other instanceof Zebra || other instanceof Elephant) {
            return Compatibility.COMPATIBLE;
        } else if (other instanceof Lion) {
            return Compatibility.INCOMPATIBLE;
        }
        return Compatibility.UNKNOWN;
    }
}
