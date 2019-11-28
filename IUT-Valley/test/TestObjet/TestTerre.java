/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjet;

import Metier.Objet.EtatTerre;
import Metier.Objet.Terre;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Kevin
 */
public class TestTerre {
    
    @Test
    /**
     * @author Kevin Lamblin
     */
    public void TestTerre(){
        //Création d'un objet terre initialisé à terre
        Terre t = new Terre();
        //Vérification
        assertEquals(EtatTerre.terre, t.getEtat());
        
    }
    
    @Test
    /**
     * @author Kevin Lamblin
     */
    
    public void TestGetEtat(){
        fail("Not supported");
    }
}
