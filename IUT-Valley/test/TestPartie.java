
import Metier.Carte.Coordonnee;
import Metier.Partie;
import Metier.Personnage.Joueur;
import Metier.Personnage.Personnage;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Lamblin
 */
public class TestPartie{
    
    @Test
    /**
     * @author Kevin Lamblin
     */
    public void TestPartie(){
        Partie p = new Partie();
        
        //Vérifie qu'un joueur est bien créer lors de la création d'une partie
        assertEquals(p.getPersonnages().get(0), p.getJoueur());
    }
    @Test
    /**
     * @author Kevin Lamblin
     * @param perso Personnage
     */
    public void TestAddPersonnage(){
        
        Partie p = new Partie();
        Personnage perso = new Joueur(new Coordonnee(10,10)); 
        p.addPersonnage(perso); //Ajout d'un personnage à la partie
        
        //Vérifie la présence de perso dans notre liste
        assertEquals(p.getPersonnages().get(1),perso); 
    }
    
}
