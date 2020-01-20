/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Plante;

import stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.ObjetNaturel;

/**
 * Plante dans la ferme
 * @author Kevin Lamblin
 */
public abstract class Plante extends ObjetNaturel{
    
    int avancement;//Variable quantifiant létat de croissance d'une plante
    
    /**
     * @author Kevin Lamblin   
     * Constructeur de plante
     */
    public Plante(){
        avancement = 1;
    }
    
    /**
     * @author Kevin Lamblin
     * Méthode qui fait pousser les plantes
     */
    public void Pousse(){
        if(avancement < 3){
            avancement += 1;
        }
    }
    
    /**
     * @author Kevin Lamblin
     * Renvoie la valeur de la croissance de la plante
     * @return int
     */
    public int getAvancement(){
        return avancement;
    }
    
    /**
     * @author Kevin Lamblin
     * Donne la famille des plantes
     * @return String
     */
    @Override
    public String getFamille(){
        return "plante";
    }
    
}
