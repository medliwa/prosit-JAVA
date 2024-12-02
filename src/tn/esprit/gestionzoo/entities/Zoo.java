package tn.esprit.gestionzoo.entities;

public class Zoo {

    private String name;
    private Animal[] animals;
    private String city;
    private final int nbrCages;
    private int nbrAnimals;
    public static final int MAX_CAGES = 25;
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
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + " already exists in the zoo.");
            return false;
        }
        if (isZooFull()) {
            System.out.println("Cannot add more animals, zoo is full.");
            return false;
        }
        animals[nbrAnimals++] = animal;
        return true;
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

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + "]";
    }
}
