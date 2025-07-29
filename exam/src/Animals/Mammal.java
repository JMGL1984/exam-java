package animals;

import enums.DietType;
import enums.HabitatType;

public abstract class Mammal extends Animal {
    public Mammal(String name, double habitatSize, DietType diet, HabitatType habitat) {
        super(name, habitatSize, diet, habitat);
    }
}


