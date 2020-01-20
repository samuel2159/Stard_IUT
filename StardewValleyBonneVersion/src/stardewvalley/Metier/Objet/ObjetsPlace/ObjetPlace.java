/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Objet.ObjetsPlace;

/**
 * Objet placé sur la carte
 * @author Kevin Lamblin
 */
public abstract class ObjetPlace {

    public abstract void Interagir();
    public abstract String getType();
    
    /**
     * @author Kevin Lamblin
     * Donne la famille objet
     * @return String
     */
    public String getFamille(){
        return "objet";
    }
}
