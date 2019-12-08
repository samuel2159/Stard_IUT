/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Carte;
import Metier.Carte.Direction;
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
        assertEquals(c.getCase(1, 1),c.getCaseProche(c.getCase(2, 2), Direction.HautGauche));
        
    }
    @Test
    /**
     * @author Samuel Tellier
     */     
    public void TestGetCaseHaut(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(2, 3),c.getCaseProche(c.getCase(2, 2), Direction.Haut));
    }
    @Test
    /**
     * @author Samuel Tellier
     */      
    public void TestGetCaseHautDroit(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(3, 1),c.getCaseProche(c.getCase(2, 2), Direction.HautDroit));
    }
    @Test
    /**
     * @author Samuel Tellier
     */       
    public void TestGetCaseGauche(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(1, 2),c.getCaseProche(c.getCase(2, 2), Direction.Gauche));
    }
    @Test
    /**
     * @author Samuel Tellier
     */      
    public void TestGetCaseDroit(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(3, 2),c.getCaseProche(c.getCase(2, 2), Direction.Droit));
    }
    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetCaseBasGauche(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(1, 1),c.getCaseProche(c.getCase(2, 2), Direction.BasGauche));
    }
    @Test
    /**
     * @author Samuel Tellier
     */       
    public void TestGetCaseBas(){
        Carte c = Carte.getCarte();     
        assertEquals(c.getCase(2, 1),c.getCaseProche(c.getCase(2, 2), Direction.Bas));
    }
    @Test
    /**
     * @author Samuel Tellier   
     */
    public void TestGetCaseBasDroit(){
        Carte c = Carte.getCarte();   
        assertEquals(c.getCase(3, 1),c.getCaseProche(c.getCase(2, 2), Direction.BasDroit));
    }    
}
