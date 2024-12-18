//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Ali", "Hassen", "Informatique", 5);
        Employe e2 = new Employe(2, "Ahmed", "Slim", "RH", 3);
        Employe e3 = new Employe(3, "Leila", "Ben", "Informatique", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("Recherche par nom 'Ahmed' : " + societe.rechercherEmploye("Ahmed"));

        System.out.println("Recherche de l'employé e1 : " + societe.rechercherEmploye(e1));

        societe.supprimerEmploye(e2);

        System.out.println("Liste après suppression :");
        societe.displayEmploye();
        societe.trierEmployeParId();
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
    }
