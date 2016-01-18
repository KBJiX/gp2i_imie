/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.console;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kbiandji
 */
public class Fenetre extends JFrame implements ActionListener{
    
    JTextField textLogin;
    JTextField textPassword;
    JLabel nomDeCompte;
    JLabel motDePasse;
    JPanel panCentre;
    JButton boutonConnect;
    
    public Fenetre() {
        //Création d'une fenêtre
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("GP2i");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //ajout du bouton de connexion
        this.boutonConnect = new JButton("Connexion");
        
        //application d'un border layout au content pane
        this.getContentPane().setLayout(new BorderLayout());
        
        this.panCentre = new JPanel();
        
        this.panCentre.setLayout(new GridLayout(3, 2));
        this.panCentre.setLayout(new FlowLayout());
        
     
        //ajout d'un champ de text
        this.textLogin = new JTextField(20);
        this.textLogin.addActionListener(this);
        this.nomDeCompte = new JLabel("Nom de compte");
        
        this.textPassword = new JTextField(20);
        this.textPassword.addActionListener(this);
        this.motDePasse = new JLabel("Mot de passe");

        
        this.panCentre.add(this.nomDeCompte);
        this.panCentre.add(this.textLogin);
        
        this.panCentre.add(this.motDePasse);  
        this.panCentre.add(this.textPassword);

        this.panCentre.add(boutonConnect);
        
        this.getContentPane().add(this.panCentre, BorderLayout.CENTER);
      
        
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    
    }
}