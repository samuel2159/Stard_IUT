/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPersonnage;

import Metier.Carte.Coordonnee;
import Metier.Personnage.Joueur;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TestJoueur {
    
    @Test
    /**
     * @author Kevin LAmblin   
     */
    public void TestGetSetEnergie(){
        //Créer un joueur avec son énergie maximal
        Joueur j = new Joueur(new Coordonnee(10,10));
        
        //Vérifie les valeurs de l'énergie de base
        assertEquals(1000, j.getEnergie());
        
        //Vérifie lorsque la valeur de l'énergie est changée
        j.setEnergie(900);
        assertEquals(900, j.getEnergie());
    }
}
