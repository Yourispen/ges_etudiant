package models;

public class NonBoursier extends Etudiant{
    private String adresse;

    public NonBoursier() {
        typeEtudiant=TypeEtudiant.NonBoursier;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "NonBoursier"+ super.toString() +"adresse=" + adresse + "]";
    }
}
