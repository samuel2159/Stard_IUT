/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte.TestCases;

import org.junit.Test;
import static org.junit.Assert.*;
import stardewvalley.Metier.Carte.Cases.CaseEau;
import stardewvalley.Metier.Carte.Coordonnee;
import stardewvalley.Metier.Objet.ObjetsPlace.AutreObjetsPlace.Porte;

/**
 *
 * @author Vincent Tantet
 */
public class TestCase{
      
    @Test
    public void TestGetSetObjetCorrespondant(){
        CaseEau c = new CaseEau(new Coordonnee(1,1));
        Porte p = new Porte();
        c.setObjetCorrespondant(p);
        assertEquals(p, c.getObjetCorrespondant());
    }  
    
    @Test
    public void TestGetCaseType(){
        CaseEau c = new CaseEau(new Coordonnee(1,1));
        assertEquals("eau", c.getCaseType());
    }
    
    @Test
    public void TestGetCoordonnee(){
        Coordonnee co = new Coordonnee(1,1);
        CaseEau c = new CaseEau(co);
        assertEquals(co,c.getCoordonnee());
    }
    
}
