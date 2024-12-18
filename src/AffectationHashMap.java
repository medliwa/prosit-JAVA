import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
            affectations.put(e, d);
            System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNom() + ".");
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des employés et leurs départements :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + " -> Département : " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("Employé " + e.getNom() + " supprimé.");
        } else {
            System.out.println("Aucun employé correspondant trouvé.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNom() + " a été supprimé.");
        } else {
            System.out.println("Aucune correspondance employé-département trouvée.");
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {
    return new TreeMap<>(affectations);
    }
}

