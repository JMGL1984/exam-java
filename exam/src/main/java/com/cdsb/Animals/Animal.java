package com.cdsb.Animals;

import org.hibernate.type.ListType;

public abstract class Animal {
    protected String name;
    protected double requiredHabitatSize;
    protected ListType dietType;
    protected HabitatType habitatType;

    public Animal(String name, double size, ListType diet, HabitatType habitat) {
        this.name = name;
        this.requiredHabitatSize = size;
        this.dietType = diet;
        this.habitatType = habitat;
    }

    public Animal(String name2, double habitatSize, DietType diet, HabitatType habitat) {
        //TODO Auto-generated constructor stub
    }

    public abstract BehaviorType getBehavior();
    public abstract Compatibility getCompatibility(Animal other);

    public String getName() { return name; }
    public double getRequiredHabitatSize() { return requiredHabitatSize; }
    public ListType getDietType() {
        return dietType;
    }
    public HabitatType getHabitatType() { return habitatType; }
}

