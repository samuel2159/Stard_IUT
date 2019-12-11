/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Listener;

import IHM.MenuPrincipal;
import MVC.Controleurs.Controleur;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author st778975
 */
public class HandlerLogo implements EventHandler<MouseEvent>{

    private MenuPrincipal source;
    private ArrayList<Controleur> listeControleur;
    
    public HandlerLogo(MenuPrincipal source) {
        this.source = source;
        this.listeControleur = new ArrayList<>();
    }
    
    private void avertirControleur() {
        for(Controleur c : this.listeControleur) {
            c.Update();
        }
    }
    public void ajouterControleur(Controleur c){
        this.listeControleur.add(c);
    }
    
    @Override
    public void handle(MouseEvent arg0) {
        avertirControleur();
    }
    
}
