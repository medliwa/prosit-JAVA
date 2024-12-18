import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /*ocieteArrayList societe = new SocieteArrayList();

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
        societe.displayEmploye();*/

        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement dep1 = new Departement(1, "Informatique", 50);
        Departement dep2 = new Departement(2, "Ressources Humaines", 30);
        Departement dep3 = new Departement(3, "Finance", 40);
        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

       gestionDepartements.displayDepartement();

        System.out.println("Recherche du département 'Informatique' : " +
                gestionDepartements.rechercherDepartement("Informatique"));

        gestionDepartements.supprimerDepartement(dep2);

        gestionDepartements.displayDepartement();

        TreeSet<Departement> sortedDepartements = gestionDepartements.trierDepartementById();
        System.out.println("Départements triés par id :");
        for (Departement d : sortedDepartements) {
            System.out.println(d);
        }
}}