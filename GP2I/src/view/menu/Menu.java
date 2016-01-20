/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author kbiandji
 */
public class Menu extends JFrame {

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFichier = new JMenu("Fichier");
    private JMenu sousMeFichier = new JMenu("Sous ficher");
    private JMenu menuEdition = new JMenu("Edition");

    private JMenuItem item1 = new JMenuItem("Ouvrir");
    private JMenuItem item2 = new JMenuItem("Fermer");
    private JMenuItem item3 = new JMenuItem("Lancer");
    private JMenuItem item4 = new JMenuItem("Arrêter");

    public Menu() {
        
        
        

    }

}
