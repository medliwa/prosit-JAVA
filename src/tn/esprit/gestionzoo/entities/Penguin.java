package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic {
    float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", Penguin [swimmingDepth=" + swimmingDepth + " meters]";
    }
}