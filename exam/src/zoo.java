package zoo;

import animals.Animal;


public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public boolean addAnimal(Animal newAnimal) {
        if (newAnimal == null) {
            System.out.println("No se puede agregar un animal nulo.");
            return false;
        }

        boolean known = true;
        boolean compatible = true;

        for (Animal existing : animals) {
            if (!existing.getHabitat().equals(newAnimal.getHabitat())) continue;

            String species1 = existing.getSpecies();
            String species2 = newAnimal.getSpecies();

            boolean isKnown = CompatibilityManager.isCompatibilityKnown(species1, species2);
            boolean isOk = CompatibilityManager.isCompatible(species1, species2);

            if (!isKnown) known = false;
            if (!isOk) {
                compatible = false;
                break;
            }
        }

        if (!compatible) {
            System.out.println(" El animal \"" + newAnimal.getSpecies() +
                    "\" no es compatible con otros animales del hábitat.");
            return false;
        }

        if (!known) {
            long sameHabitatCount = animals.stream()
                    .filter(a -> a.getHabitat().equals(newAnimal.getHabitat()))
                    .count();

            if (sameHabitatCount > 0) {
                System.out.println("Compatibilidad desconocida. Hábitat ocupado. No se puede agregar.");
                return false;
            } else {
                System.out.println("Compatibilidad desconocida. Hábitat vacío. Se permite agregar.");
            }
        }

        animals.add(newAnimal);
        System.out.println("Animal agregado: " + newAnimal.getSpecies());
        return true;
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }
}



