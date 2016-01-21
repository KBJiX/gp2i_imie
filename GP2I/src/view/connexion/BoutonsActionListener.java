/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.connexion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.menu.FenetreMenu;

/**
 *
 * @author kbiandji
 */
public class BoutonsActionListener implements ActionListener {

    FenetreConnexion fenetre;

    public BoutonsActionListener(FenetreConnexion fenetre) {
        this.fenetre = fenetre;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equalsIgnoreCase("Annuler")) {
            System.exit(0);
        } else if (ae.getActionCommand().equalsIgnoreCase("Connexion")) {
            FenetreMenu fmenu = new FenetreMenu();
            this.fenetre.setVisible(false);
        }else{
            System.err.println("message erreur");
        }
        
        
        
    }

}
