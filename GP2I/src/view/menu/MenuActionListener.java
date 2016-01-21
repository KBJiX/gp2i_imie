/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kbiandji
 */
public class MenuActionListener implements ActionListener {

    FenetreMenu fmenu;

    public MenuActionListener(FenetreMenu fmenu) {
        this.fmenu = fmenu;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        
        
        if (ae.getActionCommand().equalsIgnoreCase("Salles")) {
            TableauSalles tabSalles = new TableauSalles();

        } else if (ae.getActionCommand().equalsIgnoreCase("Machines")) {
         //  TableauMachines tabMachines = new TableauMachines();

        } else if (ae.getActionCommand().equalsIgnoreCase("Consommables")) {
         //   TableauConsommables tabConsommables = new TableauConsommables();

        } else if (ae.getActionCommand().equalsIgnoreCase("Stock")) {
         //   TableauStock tabStock = new TableauStock();

        }if (ae.getActionCommand().equalsIgnoreCase("Fermer")) {
            System.exit(0);
        }

    }

}
