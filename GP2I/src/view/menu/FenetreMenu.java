/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author kbiandji
 */
public class FenetreMenu extends JFrame {

    JPanel panMenuBar;
    JPanel panCentral;
    JPanel panMenu;

    JMenuBar menuBar;
    JMenu menuFichier;
    JMenu menuEdition;
    JMenu menuApropo;

    JMenuItem itemOuvrir;
    JMenuItem itemFermer;
    JMenuItem itemLancer;
    JMenuItem itemArreter;

    JButton boutonSalle;
    JButton boutonMachine;
    JButton boutonConsommable;
    JButton boutonStock;

    public FenetreMenu() {

        this.getContentPane().setLayout(new BorderLayout());

        this.panCentral = new JPanel();
        this.panCentral.setBackground(Color.white);
        this.panMenu = new JPanel();
        this.panMenuBar = new JPanel();

        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(this.panMenuBar, BorderLayout.NORTH);
        this.getContentPane().add(this.panCentral, BorderLayout.CENTER);
        this.getContentPane().add(this.panMenu, BorderLayout.WEST);

        this.menuBar = new JMenuBar();
        this.panMenuBar.add(this.menuBar);
        this.menuFichier = new JMenu("Fichier");
        this.menuBar.add(this.menuFichier);
        this.menuEdition = new JMenu("Edition");
        this.menuBar.add(this.menuEdition);
        this.menuApropo = new JMenu("À propos");
        this.menuBar.add(this.menuApropo);
        this.menuBar.setLayout(new GridLayout(1, 4));

        this.itemOuvrir = new JMenuItem("Ouvrir");
        this.itemFermer = new JMenuItem("Fermer");
        this.itemLancer = new JMenuItem("Lancer");
        this.itemArreter = new JMenuItem("Arrêter");

        this.boutonSalle = new JButton("Salle");
        this.boutonMachine = new JButton("Machine");
        this.boutonConsommable = new JButton("Consommable");
        this.boutonStock = new JButton("Stock");
        this.panMenu.setLayout(new GridLayout(4, 1));
        
        this.menuFichier.add(this.itemOuvrir);
        this.menuFichier.add(this.itemFermer);

        this.panMenu.add(this.boutonSalle);
        this.panMenu.add(this.boutonMachine);
        this.panMenu.add(this.boutonConsommable);
        this.panMenu.add(this.boutonStock);

        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setTitle("Mon programme swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

    }

}
