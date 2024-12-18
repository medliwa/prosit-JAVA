package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.ZooFullException;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Zoo {

    private String name;
    private Animal[] animals;
    private String city;
    private final int nbrCages;
    private int nbrAnimals;
    public static final int MAX_CAGES = 25;

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    private Aquatic[] aquaticAnimals;

    public int getNbrAnimalsAquatics() {
        return nbrAnimalsAquatics;
    }

    public void setNbrAnimalsAquatics(int nbrAnimalsAquatics) {
        this.nbrAnimalsAquatics = nbrAnimalsAquatics;
    }

    private  int nbrAnimalsAquatics;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;
        if (nbrCages > MAX_CAGES) {
            System.out.println("Le nombre de cages ne peut pas dépasser " + MAX_CAGES + ". Réglé à " + MAX_CAGES);
            this.nbrCages = MAX_CAGES;
        } else {
            this.nbrCages = nbrCages;
        }
        this.animals = new Animal[this.nbrCages];
        this.nbrAnimals = 0;
        this.aquaticAnimals = new Aquatic[10];
        this.nbrAnimalsAquatics=0;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAnimalsAquatics < 10) {
            aquaticAnimals[nbrAnimalsAquatics] = aquatic;
nbrAnimalsAquatics++;
            System.out.println("Added " + aquatic.getName() + " to the zoo.");
        } else {
            System.out.println("The aquatic animals' section is full.");
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < nbrAnimalsAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < nbrAnimalsAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public void displayAnimals() {
        if (nbrAnimals == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            for (int i = 0; i < nbrAnimals; i++) {
                System.out.println(animals[i]);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public void addAnimal(Animal animal) throws ZooFullException {

        if (searchAnimal(animal) != -1) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " already exists in the zoo.");
            return;
        }
        if (isZooFull()) {
            throw new ZooFullException("Cannot add more animals, zoo is full.");
        }
        animals[nbrAnimals++] = animal;
    }



    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[--nbrAnimals] = null;
            System.out.println(animal.getName() + " has been removed from the zoo.");
            return true;
        } else {
            System.out.println(animal.getName() + " was not found in the zoo.");
            return false;
        }
    }

    public boolean isZooFull() {

        return nbrAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
    public void displayAquaticAnimals() {
        System.out.println("Aquatic Animals in " + name + ":");
        if (nbrAnimalsAquatics == 0) {
            System.out.println("No aquatic animals in this zoo.");
        } else {
            for (int i = 0; i < nbrAnimalsAquatics; i++) {
                System.out.println(aquaticAnimals[i]);
            }
        }
    }
    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + "]";
    }
}
