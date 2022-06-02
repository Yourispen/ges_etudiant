package models;

public class Boursier extends Etudiant {
    private TypeBourse typeBourse;
    private double valeur;
    public static final double DEMIBOURSE=20000.0;
    public static final double ENTIEREBOURSE=40000.0;
    private Chambre chambre;

    public Boursier() {
        typeEtudiant = TypeEtudiant.BoursierNonLoge; 
    }
    public TypeBourse getTypeBourse() {
        return typeBourse;
    }
    public void setTypeBourse(TypeBourse typeBourse) {
        valeur=typeBourse==TypeBourse.Demi?DEMIBOURSE:ENTIEREBOURSE;
        this.typeBourse = typeBourse;
    }
    public double getValeur() {
        return valeur;
    }
    @Override
    public String toString() {
        return "Boursier"+ super.toString()+ " typeBourse=" + typeBourse + ", valeur=" + valeur + "]";
    }
    public Chambre getChambre() {
        return chambre;
    }
    public void setChambre(Chambre chambre) {
        chambre.ajouterBoursier(this);
        this.chambre = chambre;
    }
    
    
    
}
