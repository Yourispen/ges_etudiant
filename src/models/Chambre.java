package models;

import java.util.ArrayList;

public class Chambre {
    private int id, numeroChambre, numeroEtage;
    private TypeChambre typeChambre;
    private Statut statut;
    private static int nbChambre;
    ArrayList<Boursier> boursiers = new ArrayList<>();
    private Pavillon pavillon;

    public Pavillon getPavillon() {
        return pavillon;
    }
    public Chambre(Pavillon pavillon) {
        id=++nbChambre;
        statut = Statut.Disponible;
        this.pavillon = pavillon;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public int getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    public TypeChambre getTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }
    public Statut getStatut() {
        return statut;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }
    @Override
    public String toString() {
        return "Chambre [id=" + id + ", numeroChambre=" + numeroChambre + ", numeroEtage=" + numeroEtage + ", statut="
                + statut + ", typeChambre=" + typeChambre + "]";
    }
    public ArrayList<Boursier> getBoursiers() {
        return boursiers;
    }
    public void ajouterBoursier(Boursier boursier){
        int taille = typeChambre==TypeChambre.Individuelle?1:2;
        if(boursiers.size()<taille){
            boursiers.add(boursier);
        }
        else{
            System.out.println("Cette chambre est pleine");
        }
    }
    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }
}
