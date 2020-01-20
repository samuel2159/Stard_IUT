/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPersonnage.TestItem;

import Metier.Personnage.Item.Plantes.Mais;
import Metier.Personnage.Item.Plantes.Panais;
import Metier.Personnage.Stack;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *Test de la classe stack 
 * @author ab899799
 */
public class TestStack {
    
    public TestStack() {
    }
    @Test
    public void TestgetItem(){
        Mais m = new Mais();
        Stack s = new Stack(m);
        assertEquals(s.getItem(),m);
    }
    /**
     * test de la méthode getQuantité 
     */
     @Test
    public void TestgetQuantite(){
        Mais m = new Mais();
        Stack s = new Stack(m);
        assertEquals(s.getQuantite(), 1);
    }
    /**
     * Test de la méthode setItem
     */
    
     @Test
    public void TestsetItem(){
        Mais m = new Mais();
        Panais p = new Panais();
        Stack s = new Stack(m);
        s.setItem(p);        
       assertEquals(s.getItem(),p);
    }
    
    /**
     * test de la méthode setQuantité
     */
    
    @Test
    public void TestsetQuantite(){
        Panais p = new Panais();
        Stack s = new Stack(p);
        s.setQuantite(1000);          
        assertEquals(s.getQuantite(),1000);
    }
    /**
     * Test de la méthode ajouteQuantité
     */
    
    @Test
    public void TestAjoutQuantite(){
        Panais p = new Panais();
        Stack s = new Stack(p);
        s.ajoutQuantite(5);
        assertEquals(s.getQuantite(),6);
    }
    
    
    
    
    
    
    
    
    
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
