/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.Metier.Objet.ObjetsPlace.ObjetsNaturel.Arbres;

/**
 * Sapin du jeu
 * @author Kevin Lamblin
 */
public class Sapin extends Arbre{

    @Override
    /**
     * @author Kevin Lamblin
     */
    public void Interagir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /**
     * @author Kevin Lamblin
     * @return String
     */
    public String getType() {
        return "sapin";
    }

    @Override
    public int hashCode() {
        int hash = 7;        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sapin other = (Sapin) obj;

        return true;
    }
    
}
