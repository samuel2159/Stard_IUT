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
public class Sapin extends Arbre{
   

    @Override
    public void Interagir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
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
