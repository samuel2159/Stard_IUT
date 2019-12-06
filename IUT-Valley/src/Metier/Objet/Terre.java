/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Objet;

<<<<<<< Updated upstream:IUT-Valley/src/Metier/Objet/Terre.java
import Metier.Objet.ObjetNaturel;
import Metier.Objet.ObjetPlace;
=======
import Metier.Carte.Carte;
import Metier.Carte.Coordonnee;
>>>>>>> Stashed changes:IUT-Valley/src/Metier/Carte/Cases/CaseTerre.java

/**
 *
 * @author telli
 */
public class Terre extends ObjetNaturel {
    
    private EtatTerre etat; //Etat de la terre (de base ou bêchée)

<<<<<<< Updated upstream:IUT-Valley/src/Metier/Objet/Terre.java
    public Terre() {
=======
    /**
     * @author Kevin Lamblin
     * @param c Coordonnee
     */
    public CaseTerre(Coordonnee c,Carte carte) {
        super(c,carte);
>>>>>>> Stashed changes:IUT-Valley/src/Metier/Carte/Cases/CaseTerre.java
    }

    @Override
    public void Interagir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getType() {
        return "terre";
    }
    
    /**
     * @author Kevin Lamblin
     * @return EtatTerre
     */
    public EtatTerre getEtat(){
        return etat;
    }    
    
}
