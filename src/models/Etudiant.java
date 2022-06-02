package models;

import java.time.LocalDate;

public abstract class Etudiant {
    protected int id;
    protected String matricule, nom, prenom,email,tel;
    protected LocalDate dateNaiss;
    protected TypeEtudiant typeEtudiant;
    private static int nbEtudiant;
    public Etudiant(String matricule, String nom, String prenom, String email, String tel, LocalDate dateNaiss) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.dateNaiss = dateNaiss;
        id=++nbEtudiant;
    }
    public Etudiant() {
        id=++nbEtudiant;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMatricule() {
        return matricule;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public LocalDate getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }
    @Override
    public String toString() {
        return " dateNaiss=" + dateNaiss + ", email=" + email + ", id=" + id + ", matricule=" + matricule
                + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", typeEtudiant=" + typeEtudiant + "]";
    }
    public TypeEtudiant getTypeEtudiant() {
        return typeEtudiant;
    }
    public void setTypeEtudiant(TypeEtudiant typeEtudiant) {
        this.typeEtudiant = typeEtudiant;
    }
    
}
