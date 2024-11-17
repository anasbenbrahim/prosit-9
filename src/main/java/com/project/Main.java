package com.project;



public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe emp1 = new Employe(1, "Ali", "Ben Salah", "Informatique", 3);
        Employe emp2 = new Employe(2, "Samir", "Trabelsi", "Ressources Humaines", 2);
        Employe emp3 = new Employe(3, "Nadia", "Benzarti", "Informatique", 4);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        System.out.println("Avant tri par ID:");
        societe.displayEmploye();

        System.out.println("*************************");

        societe.trierEmployeParId();
        System.out.println("Après tri par ID:");
        societe.displayEmploye();

        System.out.println("*************************");

        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("Après tri par Nom, Département et Grade:");
        societe.displayEmploye();

        System.out.println("***************************");

        String nomRecherche = "Samir";
        boolean employeExiste = societe.rechercherEmploye(nomRecherche);

        if (employeExiste) {
            System.out.println("L'employé avec le nom '" + nomRecherche + "' existe dans la liste.");
        } else {
            System.out.println("L'employé avec le nom '" + nomRecherche + "' n'existe pas dans la liste.");
        }
    }
}
