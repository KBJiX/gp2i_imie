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
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author kbiandji
 */
public class FenetreMenu extends JFrame {

    JPanel panMenuBar;
    JPanel panCentral;
    JPanel panMenu;
    JPanel panS;

    JMenuBar menuBar;
    JMenu menuFichier;
    JMenu menuEdition;
    JMenu menuApropo;

    JMenuItem itemOuvrir;
    JMenuItem itemFermer;

    JButton boutonSalle;
    JButton boutonMachine;
    JButton boutonConsommable;
    JButton boutonStock;

    public FenetreMenu() {

        this.getContentPane().setLayout(new BorderLayout());

        this.panCentral = new JPanel();
        this.panCentral.setBackground(Color.white);
        this.panMenu = new JPanel();
        this.panS = new JPanel();
        this.menuBar = new JMenuBar();

        this.getContentPane().setLayout(new BorderLayout());
        //this.getContentPane().setLayout(new CardLayout());
        

        this.getContentPane().add(this.menuBar, BorderLayout.NORTH);
        this.getContentPane().add(this.panCentral, BorderLayout.CENTER);
        this.getContentPane().add(this.panMenu, BorderLayout.WEST);
        this.getContentPane().add(this.panS, BorderLayout.SOUTH);

        this.menuFichier = new JMenu("Fichier");
        this.menuBar.add(this.menuFichier);
        this.menuEdition = new JMenu("Edition");
        this.menuBar.add(this.menuEdition);
        this.menuApropo = new JMenu("À propos");
        this.menuBar.add(this.menuApropo);

        this.itemOuvrir = new JMenuItem("Ouvrir");
        this.itemFermer = new JMenuItem("Fermer");
        this.itemOuvrir.addActionListener(new MenuActionListener(this));
        this.itemFermer.addActionListener(new MenuActionListener(this));

        this.boutonSalle = new JButton("Salles");
        this.boutonMachine = new JButton("Machines");
        this.boutonConsommable = new JButton("Consommables");
        this.boutonStock = new JButton("Stock");
        this.boutonSalle.addActionListener(new MenuActionListener(this));
        this.boutonMachine.addActionListener(new MenuActionListener(this));
        this.boutonConsommable.addActionListener(new MenuActionListener(this));
        this.boutonStock.addActionListener(new MenuActionListener(this));
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
