/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPersonnage;


import org.junit.Test;
import static org.junit.Assert.*;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Personnages.Joueur;

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
        Joueur j = new Joueur();
        
        //Vérifie les valeurs de l'énergie de base
        assertEquals(1000, j.getEnergie());
        
        //Vérifie lorsque la valeur de l'énergie est changée
        j.setEnergie(900);
        assertEquals(900, j.getEnergie());
    }
}
