/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPersonnage;


import org.junit.Assert;
import org.junit.Test;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Personnages.Joueur;
import stardewvalley.Metier.Personnages.Personnage;

/**
 *
 * @author Kevin Lamblin
 */
public class TestPersonnage{
    
    @Test
    /**
     * @author Kevin Lamblin
     */
    public void TestDeplacement(){
       
        //Création d'un personnage
        Personnage p = new Joueur();
        
        //Vérifie que le joueur est à la bonne position intiale  
        Coordonnee c = new Coordonnee(5,5);
        Assert.assertEquals(p.getPosition().getX(), c.getX());
        Assert.assertEquals(p.getPosition().getY(), c.getY());
        
        //Initialisation des coordonnees de test
        Coordonnee droite = new Coordonnee(1,0);
        Coordonnee gauche = new Coordonnee(-1,0);
        Coordonnee haut = new Coordonnee(0,1);
        Coordonnee bas = new Coordonnee(0,-1);
        
        //Vérifie les 4 directions 
        p.Deplacer(droite);
        Assert.assertEquals(6, p.getPosition().getX());
        Assert.assertEquals(5, p.getPosition().getY());
        
        p.Deplacer(gauche);
        p.Deplacer(gauche);
        Assert.assertEquals(4, p.getPosition().getX());
        Assert.assertEquals(5, p.getPosition().getY());
        
        p.Deplacer(haut);
        p.Deplacer(droite);
        Assert.assertEquals(5, p.getPosition().getX());
        Assert.assertEquals(6, p.getPosition().getY());
        
        p.Deplacer(bas);
        p.Deplacer(bas);
        Assert.assertEquals(5, p.getPosition().getX());
        Assert.assertEquals(4, p.getPosition().getY());
        
    }
}
