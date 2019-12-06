/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Carte;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Cases.Cote;
import Metier.Carte.Coordonnee;
import Metier.Objet.Sapin;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Kevin Lamblin
 */
public class TestCase{

    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetCaseHautGauche(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(1, 1),c.getCase(2, 2).getCase(Cote.HautGauche));
        
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseHaut(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(2, 1),c.getCase(2, 2).getCase(Cote.Haut));        
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseHautDroit(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(3, 1),c.getCase(2, 2).getCase(Cote.HautDroit));
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseGauche(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(1, 2),c.getCase(2, 2).getCase(Cote.Gauche));
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseDroit(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(3, 2),c.getCase(2, 2).getCase(Cote.Droit));
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseBasGauche(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(1, 3),c.getCase(2, 2).getCase(Cote.BasGauche));
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseBas(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(2, 3),c.getCase(2, 2).getCase(Cote.Bas));
    }
    @Test
    /**
     * @author Samuel Tellier
     */        
    public void TestGetCaseBasDroit(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(3, 3),c.getCase(2, 2).getCase(Cote.BasDroit));
    }    
   
    
}
