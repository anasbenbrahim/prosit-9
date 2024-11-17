package com.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{


    private List<Employe> employes = new ArrayList<>();


    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }


    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }


    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }


    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }


    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }


    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new Employe());
    }


}
