/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjet;

import Metier.Objet.Lit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ab899799
 */
public class TestLit 
{
    
        public TestLit() {}
        
        @Test
        public void TestgetType(){
            Lit l = new Lit();
            assertEquals(l.getType(),"lit");
        }
}
    
   
   