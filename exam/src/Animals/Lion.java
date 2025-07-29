package animals;

import enums.BehaviorType;
import enums.Compatibility;
import enums.DietType;
import enums.HabitatType;

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


