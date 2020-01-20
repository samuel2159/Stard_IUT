/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stardewvalley.ControleursObservateurs.Observers;

import javafx.scene.Scene;
import stardewvalley.Main;

/**
 *
 * @author simonetma
 */
public class ObserverChangementScene extends Observer {
    
    private Scene nouvelleScene;

    public ObserverChangementScene(Scene nouvelleScene) {
        this.nouvelleScene = nouvelleScene;
    }
    
    @Override
    public void update() {
        Main.changementScene(nouvelleScene);
    }
    
}
