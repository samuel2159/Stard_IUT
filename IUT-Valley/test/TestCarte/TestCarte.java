/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Carte;
<<<<<<< Updated upstream
=======
import Metier.Carte.Cases.Case;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;
import Metier.Objet.Sapin;
import static org.junit.Assert.assertEquals;
>>>>>>> Stashed changes
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TestCarte {
    
    @Test
    /**
     * @author Kevin Lamblin
     */
    public void TestGetCarte(){
        Carte c = Carte.getCarte();
        
<<<<<<< Updated upstream
        assertNotEquals(null, c);
    }
=======
        //assertNotEquals(null, c);
    }

    

    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetCases(){
        Carte c = Carte.getCarte();
        
        assertEquals(c.getCases().get(new Coordonnee(5,5)),new CaseTerre(new Coordonnee(5, 5),c));
        
    }

    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetCase(){
        Carte c = Carte.getCarte();        
        assertEquals(c.getCase(1,1),new CaseTerre(new Coordonnee(1, 1),c));
        
        CaseTerre ct = new CaseTerre(new Coordonnee(2, 2),c);
        ct.setObjetCorrespondant(new Sapin());
        assertEquals(c.getCase(2,2),ct);
        
    }
>>>>>>> Stashed changes
    
}
