package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

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
    }
}
