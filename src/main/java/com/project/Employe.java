package com.project;

import java.util.Comparator;

public class Employe implements Comparable<Employe> , Comparator<Employe> {


    private int id;
    private String nom;
    private String prenom;
    private String departmentName;
    private  int grade;

    public Employe(int id, String nom, String prenom, String departmentName, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    public Employe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employe employe = (Employe) obj;

        return id == employe.id && (nom != null ? nom.equals(employe.nom) : employe.nom == null);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departmentName + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Employe employe) {
        return this.id - employe.id;
    }

    @Override
    public int compare(Employe e1, Employe e2) {
        int result = Integer.compare(e1.grade, e2.grade);  // Comparer d'abord par grade
        if (result == 0) {
            result = e1.nom.compareToIgnoreCase(e2.nom);  // Si le grade est le même, comparer par nom (sans distinction de casse)
        }
        return result;
    }
}
