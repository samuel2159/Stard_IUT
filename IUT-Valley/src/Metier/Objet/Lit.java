/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Objet;

/**
 *
 * @author telli
 */
public class Lit extends ObjetPlace{
    
    public Lit(){
        
    }
    
    @Override
    public void Interagir() {
        System.out.println("ok");
    }

    @Override
    public String getType() {
        return "Lit";
    }
    
}
