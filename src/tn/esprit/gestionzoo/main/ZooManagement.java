package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.*;

public class ZooManagement {
    public static void main(String[] args) {


     /**   Animal lion = new Animal("cats", "Simba", 10, true);
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
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);
        Zoo zoo = new Zoo("bilvidere", "bilvidere", 3);


        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);
        zoo.displayNumberOfAquaticsByType();

        for (int i=0; i< zoo.getNbrAnimalsAquatics();i++){
            zoo.getAquaticAnimals()[i].swim();
        }
        Aquatic dolphin1 = new Dolphin("Cetacea", "Flipper", 5, true, "Ocean", 25.5f);
        Aquatic dolphin2 = new Dolphin("Cetacea", "Flipper", 5, true, "Ocean", 30.0f);
        if (dolphin1.equals(dolphin2)) {
            System.out.println("The two dolphins are equal.");
        } else {
            System.out.println("The two dolphins are not equal.");
        } */
        Zoo zoo = new Zoo("Safari Park", "Ariana", 3);
        try {
            Animal lion = new Animal("cats", "Simba", 10, true);
            zoo.addAnimal(lion);
            System.out.println("Number of animals: " + zoo.getNbrAnimals());
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            Animal tiger = new Animal("cats", "Shere Khan", -10, true);  // Provoquera InvalidAgeException
            zoo.addAnimal(tiger);
            System.out.println("Number of animals: " + zoo.getNbrAnimals());
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            Animal elephant = new Animal("elephants", "Dumbo", 25, true);
            zoo.addAnimal(elephant);
            System.out.println("Number of animals: " + zoo.getNbrAnimals());
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            Animal giraffe = new Animal("giraffes", "Melman", 12, false);
            zoo.addAnimal(giraffe);
            System.out.println("Number of animals: " + zoo.getNbrAnimals());
        } catch (InvalidAgeException | ZooFullException e) {
            System.out.println(e.getMessage());
        }




        System.out.println("Displaying animals in the zoo:");
        zoo.displayAnimals();
    }

}

