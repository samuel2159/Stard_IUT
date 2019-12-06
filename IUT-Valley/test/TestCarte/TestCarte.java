/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Carte;
import Metier.Carte.Cases.Case;
import Metier.Carte.Cases.CaseTerre;
import Metier.Carte.Coordonnee;
import Metier.Objet.ObjetPlace;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TestCarte {
    
   // @Test
    /**
     * @author Kevin Lamblin
     */
    public void TestGetCarte(){
        Carte c = Carte.getCarte();
        
        //assertNotEquals(null, c);
    }
    
    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetObjetsAdjacents(){
        Carte c = Carte.getCarte();
        ObjetPlace c1 = c.getCases().get(new Coordonnee(2,2)).getObjetCorrespondant();
        assertEquals(c1,Carte.getCarte().getObjetsAdjacentes(new Coordonnee(1,2)).get(4));
        //assertEquals(c1.getType(),"sapin");
    }
    

    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetCases(){
        Carte c = Carte.getCarte();
        
        assertEquals(c.getCases().get(new Coordonnee(5,5)),new CaseTerre(new Coordonnee(5, 5)));
        
    }

    @Test
    /**
     * @author Samuel Tellier
     */    
    public void TestGetCase(){/*
        Carte c = Carte.getCarte();
        ObjetPlace c1 = c.getCases().get(new Coordonnee(2,2)).getObjetCorrespondant();
        assertEquals(c1,Carte.getCarte().getObjetsAdjacentes(new Coordonnee(5,6)).get(1));
        //assertEquals(c1.getType(),"sapin");*/
    }    
    
}
