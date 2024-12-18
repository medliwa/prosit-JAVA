import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>{
    private ArrayList<Employe> listeEmployes;
    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>(); // Initialisation de la liste
    }

    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
        System.out.println("Employé ajouté : " + e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if (listeEmployes.remove(e)) {
            System.out.println("Employé supprimé : " + e);
        } else {
            System.out.println("Employé non trouvé : " + e);
        }
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {

        Collections.sort(listeEmployes);
        System.out.println("Liste triée par ID.");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

            Comparator<Employe> nomDepartementComparator = new Comparator<Employe>() {
                @Override
                public int compare(Employe e1, Employe e2) {
                    return e1.getNomDepartement().compareTo(e2.getNomDepartement());
                }
            };

            Comparator<Employe> gradeComparator = new Comparator<Employe>() {
                @Override
                public int compare(Employe e1, Employe e2) {
                    return Integer.compare(e1.getGrade(), e2.getGrade());
                }
            };

            Collections.sort(listeEmployes, nomDepartementComparator.thenComparing(gradeComparator));
            System.out.println("Liste triée par nom de département et grade.");
        }

    }


