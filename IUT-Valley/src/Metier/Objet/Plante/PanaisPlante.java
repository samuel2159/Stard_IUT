/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier.Objet.Plante;

/**
 * @author Kevin Lamblin
 * Correpond à un plant de panais
 */
public class PanaisPlante extends Plante{

    /**
     * @author Kevin Lamblin
     * Constructeur de Panais
     */
    public PanaisPlante(){
        super();
    }
    
    /**
     * @author Kevin Lamblin
     * Interaction avec un plant Panais
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
        return "Panais";
    }
    
}
