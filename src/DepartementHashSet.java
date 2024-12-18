import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {

        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement d : departements) {
            if (d.getNom().equals(nom)) {
                return true;
            }
        }
        return false;    }

    @Override
    public boolean rechercherDepartement(Departement departement) {

        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {

        departements.remove(departement);
    }
    @Override
    public void displayDepartement() {

        System.out.println(departements);
    }
    @Override
    public TreeSet<Departement> trierDepartementById() {
        Comparator<Departement> comparator = new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeSet<Departement> tree = new TreeSet<>(comparator);
        tree.addAll(departements);
        return  tree;
    }
}