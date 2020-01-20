/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Plante;

/**
 * @author Kevin Lamblin
 * Correspond à un plant de mais
 */
public class MaisPlante extends Plante{

    /**
     * @author Kevin Lamblin
     * Constructeur de mais
     */
    public MaisPlante(){
        super();
    }
    
    /**
     * @author Kevin Lamblin
     * Interaction avec un plant de mais
     */
    @Override
    public void Interagir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @author Kevin Lamblin
     * Renvoie le type
     * @return String
     */
    @Override
    public String getType() {
        return "Mais";
    }
}
