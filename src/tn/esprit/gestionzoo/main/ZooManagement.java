package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {



        Animal lion = new Animal("cats", "Simba", 10, true);
        Animal tiger = new Animal("cats", "Shere Khan", 8, true);
        Animal elephant = new Animal("elephants", "Dumbo", 25, true);
        Animal giraffe = new Animal("giraffes", "Melman", 12, false);

        Zoo zoo1 = new Zoo("Safari Park", "Ariena", 3);
        Zoo zoo2 = new Zoo("City tn.esprit.gestionzoo.entities.Zoo", "Metropolis", 5);

        zoo1.displayZoo();
        zoo2.displayZoo();
        System.out.println("Adding Lion to zoo1: " + zoo1.addAnimal(lion));
        System.out.println("Adding Tiger to zoo1: " + zoo1.addAnimal(tiger));
        System.out.println("Adding Elephant to zoo1: " + zoo1.addAnimal(elephant));
        System.out.println("Is zoo1 full? " + zoo1.isZooFull());

        System.out.println("Adding Giraffe to zoo1: " + zoo1.addAnimal(giraffe));

        System.out.println("Displaying animals in zoo1:");
        zoo1.displayAnimals();

        System.out.println("Adding Lion to zoo2: " + zoo2.addAnimal(lion));
        System.out.println("Adding Giraffe to zoo2: " + zoo2.addAnimal(giraffe));

        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("The zoo with more animals is: " + biggerZoo.getName());

        System.out.println("Displaying animals in zoo2:");
        zoo2.displayAnimals();
        Dolphin dolphin = new Dolphin("Cetacea", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctica", 150.0f);
        Terrestrial terrestrial = new Terrestrial("Felidae", "Simba", 10, true, 4);
        Aquatic aquatic = new Aquatic("Cetacea", "Sea Lion", 4, true, "Ocean");
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
