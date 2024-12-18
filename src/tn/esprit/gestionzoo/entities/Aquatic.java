package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.interfaces.Food;

import java.util.Objects;

public abstract non-sealed class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(this.getName() + " is eating meat.");
        } else {
            System.out.println(this.getName() + " cannot eat plants.");
        }
    }

    public abstract void swim();{
        System.out.println("This aquatic animal is swimming.");
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);  // Use name, age, and habitat for hash code
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Aquatic [habitat=" + habitat + "]";
    }
}
