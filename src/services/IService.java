package services;

import java.util.ArrayList;

import models.Boursier;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;
import models.Statut;

public interface IService {
    void ajouterPavillon(Pavillon pavillon);
    void ajouterPavillon(Pavillon pavillon, ArrayList<Chambre> chambres);
    void listerPavillon();
    void modifierPavillon(Pavillon pavillon);
    void ajouterChambre(Chambre chambre);
    void ajouterChambre(Chambre chambre, Pavillon pavillon);
    void modifierChambre(Statut statut);
    void listerChambre();
    Chambre rechercheChambre(int id);
    Pavillon recherchePavillon(int id);
    Etudiant rechercheEtudiant(int id);
    void ajouterEtudiant(Etudiant etudiant);
    void affecterChambre(Boursier  boursier, Chambre chambre);
    void listerChambreUnPavillon(Pavillon pavillon);
    void listerEtudiantUneChambre(Chambre chambre);

    
}
