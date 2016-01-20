/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.connexion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kbiandji
 */
public class FenetreConnexion extends JFrame {

    JTextField textLogin;
    JTextField textPassword;
    JLabel nomDeCompte;
    JLabel motDePasse;
    JPanel panCentre;
    JPanel panConnexion;
    JButton boutonConnect;
    JButton boutonAnnuler;

    public FenetreConnexion() {

        this.panCentre = new JPanel();

        //ajout du bouton de connexion
        this.boutonConnect = new JButton("Connexion");
        this.boutonAnnuler = new JButton("Annuler");
        this.boutonConnect.addActionListener(new BoutonsActionListener(this));
        this.boutonAnnuler.addActionListener(new BoutonsActionListener(this));

        //application d'un border layout au content pane
        this.getContentPane().setLayout(new BorderLayout());

        //identification
        this.panConnexion = new JPanel();
        panConnexion.setBackground(Color.white);
        panConnexion.setPreferredSize(new Dimension(340, 140));
        panConnexion.setBorder(BorderFactory.createTitledBorder("Identification"));

        //creation  des champs de text
        this.textLogin = new JTextField(15);
        this.textPassword = new JTextField(15);

        //this.textLogin.addActionListener(new BoutonsActionListener(this));
        this.nomDeCompte = new JLabel("    Nom de compte : ");
        //this.textPassword.addActionListener(new BoutonsActionListener(this));
        //BoutonsActionListener actionListener = new BoutonsActionListener(this);


        this.motDePasse = new JLabel("    Mot de passe : ");

        this.panConnexion.add(this.nomDeCompte);
        this.panConnexion.add(this.textLogin);
        this.panConnexion.add(this.motDePasse);
        this.panConnexion.add(this.textPassword);

        this.panConnexion.add(boutonConnect);
        this.panConnexion.add(boutonAnnuler);
        this.panCentre.add(panConnexion);

        this.panConnexion.setLayout(new GridLayout(3, 2));

        this.getContentPane().add(this.panCentre, BorderLayout.CENTER);

        //Création d'une fenêtre
        this.setSize(360, 200);
        this.setLocationRelativeTo(null);
        this.setTitle("GP2i");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }



}
