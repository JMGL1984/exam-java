package animals;

import enums.*;

public abstract class Animal {
    protected String name;
    protected double requiredHabitatSize;
    protected DietType dietType;
    protected HabitatType habitatType;

    public Animal(String name, double size, DietType diet, HabitatType habitat) {
        this.name = name;
        this.requiredHabitatSize = size;
        this.dietType = diet;
        this.habitatType = habitat;
    }

    public abstract BehaviorType getBehavior();
    public abstract Compatibility getCompatibility(Animal other);

    public String getName() { return name; }
    public double getRequiredHabitatSize() { return requiredHabitatSize; }
    public DietType getDietType() { return dietType; }
    public HabitatType getHabitatType() { return habitatType; }
}

