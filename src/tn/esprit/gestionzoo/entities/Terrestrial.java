package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.interfaces.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {
    int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", Terrestrial [nbrLegs=" + nbrLegs + "]";
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        } else {
            System.out.println(this.getName() + " cannot eat plants only.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(this.getName() + " is eating plants.");
        } else {
            System.out.println(this.getName() + " cannot eat meat only.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(this.getName() + " is eating both meat and plants.");
        } else if (food == Food.MEAT) {
            eatMeat(food);
        } else {
            eatPlant(food);
        }
    }
}
