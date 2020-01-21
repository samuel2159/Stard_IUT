/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Personnages.Inventaire.Objets;

/**
 *
 * @author Lamblin Kévin
 */
public abstract class Objet {
    
    public abstract String getType();
    
    public String getFamille(){
        return "Objet";
    }
    
}
