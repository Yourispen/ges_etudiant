package models;

import java.util.ArrayList;

public class Pavillon {
    private int id, numero, nbreEtage;
    private static int nbPavillon;
    ArrayList<Chambre> chambres = new ArrayList<>();

    public Pavillon() {
        id=++nbPavillon;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNbreEtage() {
        return nbreEtage;
    }
    public void setNbreEtage(int nbreEtage) {
        this.nbreEtage = nbreEtage;
    }
    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbreEtage=" + nbreEtage + ", numero=" + numero + "]";
    }
    public ArrayList<Chambre> getChambres() {
        return chambres;
    }
    public void ajouterChambre(Chambre chambre){
        chambre.setPavillon(this);
        chambres.add(chambre);
    }
    
}
