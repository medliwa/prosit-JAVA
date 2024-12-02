class Zoo {
    String name;
    Animal[] animals;
    String city;
    final int nbrCages= 25;
    int nbrAnimals;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Zoo name cannot be empty.");
            this.name = "Unnamed Zoo";
        }
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

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimals = 0;
    }
    
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
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
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal " + animal.name + " already exists in the zoo.");
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
            System.out.println(animal.name + " has been removed from the zoo.");
            return true;
        } else {
            System.out.println(animal.name + " was not found in the zoo.");
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
        return "Zoo [Name=" + name + ", City=" + city + ", Number of Cages=" + nbrCages + "]";
    }
}
