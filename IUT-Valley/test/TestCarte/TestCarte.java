/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCarte;

import Metier.Carte.Carte;
import java.io.FileNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de test pour la classe Carte
 * @author Kevin
 */
public class TestCarte {
    
    @Test
    /**
     * @author Kevin Lamblin
     * @throws java.io.FileNotFoundException
     */
    public void TestGetCarte(){
       Carte c = Carte.getCarte();
       assertNotEquals(null, c);
    }
    
    @Test
    /**
     * @author Kevin Lamblin 
     */    
    public void TestGetCases() throws FileNotFoundException{
        Carte c = Carte.getCarte();
        assertNotEquals(null, c.getCases());
    }

    @Test
    /**
     * @author
     */    
    public void TestGetCase(){
        
    }
    
    @Test
    /**
     * @author
     */
    public void TesGetCaseProche(){
        
    }

    
}
