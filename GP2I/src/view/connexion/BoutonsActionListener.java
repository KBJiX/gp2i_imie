/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.connexion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

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
            System.out.println("Coucou");
        }else{
            System.err.println("message erreur");
        }
    }

}
