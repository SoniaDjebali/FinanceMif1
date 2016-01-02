package com.sdesilv4.gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Created by paard consulting on 10/11/2015.
 */
public class Fenetre extends JFrame{
    //Instanciation d'un objet JPanel
    private static JPanel jPan = new JPanel();
    //Instanciation d'un bouton
    private static JButton boutonValider = new JButton("Valider");
    private static JButton boutonDetail = new JButton("Details");
    //Instanciation d'un Label
    private static JLabel labelChoix = new JLabel("Choix : ");
    //Instanciation d'un comboBox
    private static JComboBox choixCACSBF = new JComboBox();
    private static JComboBox choixActionIndice = new JComboBox();
    private static JComboBox listeAction = new JComboBox();

    public Fenetre() {
        jPan.setLayout(null);
        //D�finir un titre pour la fen�tre
        this.setTitle("Projet Finance");
        //D�finir sa taille
        this.setSize(390, 300);
        //Positionner la fen�tre au centre de la fen�tre
        this.setLocationRelativeTo(null);
        //Terminer le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Rendre visible la fen�tre
        this.setVisible(true);
        //Emp�cher le redimensionnement de la fen�tre
        this.setResizable(false);
        // Changer couleur de la fen�tre
        this.getContentPane().setBackground(Color.WHITE);

        jPan.setLayout(new BorderLayout());
        getContentPane().add(jPan);

        jPan.setLayout(null);

        labelChoix.setBounds(40, 20, 80, 40);
        labelChoix.setFont(new Font("Times New Roman", Font.BOLD, 17)); // Changer la police du texte
        Color couleur = new Color(200, 100, 255); // Changer la couleur du texte
        labelChoix.setForeground(couleur);
        labelChoix.setVisible(true);
        jPan.add(labelChoix);

        choixCACSBF.setBounds(120, 20, 100, 40);
        choixCACSBF.addItem("CAC 40"); //Ins�rer des valeurs dans le comboBox
        choixCACSBF.addItem("SBF 250");
        choixCACSBF.setVisible(true);
        jPan.add(choixCACSBF);

        boutonValider.setBounds(240, 20, 100, 40);
        jPan.add(boutonValider);

        listeAction.setBounds(40, 100, 300, 40);
        jPan.add(listeAction);

        boutonDetail.setBounds(150, 180, 100, 40);
        jPan.add(boutonDetail);

        jPan.setBackground(Color.WHITE);
        this.setVisible(true);
    }

    public String getComboBox_choixCACSBF(){
        return (String) choixCACSBF.getSelectedItem(); // Permet de r�cup�rer la valeur String du ComboBox
    }

    public String getComboBox_choixActionIndice(){
        return (String) choixActionIndice.getSelectedItem(); // Permet de r�cup�rer la valeur String du ComboBox
    }

    public void addPremierListener(ActionListener listenPremierBouton){
        boutonValider.addActionListener(listenPremierBouton);
    }

    // Action au d�clenchement d'un evenement
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boutonValider)
            if(choixCACSBF.getSelectedItem().toString() == "Choisir l'indice"){
                JOptionPane.showMessageDialog(this,"Veuillez choisir un indice.", "Indice non renseigne", JOptionPane.WARNING_MESSAGE);
            }else if(choixCACSBF.getSelectedItem().toString() == "CAC 40"){
                // action si CAC 40

                // par exemple on veut afficher le tableau dans une nouvelle fenetre
              //  actions.setVisible(true);

            }else if(choixCACSBF.getSelectedItem().toString() == "SBF 120"){
                // action si SBF 120
            }
    }

    /*class BoutonValiderCAC implements ActionListener {
        public void actionPerformed(ActionEvent argBouton) {
            if (choixCACSBF.getSelectedIndex() == 0 && choixActionIndice.getSelectedIndex() == 0) {
                new FenetreTableauAction().setVisible(true);
            }
            else if (choixCACSBF.getSelectedIndex() == 0 && choixActionIndice.getSelectedIndex() == 1) {
                new TableauIndice().setVisible(true);
            }
        }
    }*/

    public void messageErreur(String messageErreur){

        JOptionPane.showMessageDialog(this, messageErreur);
    }

    public void setComboBoxListeActions(String actions){
        listeAction.addItem(actions);
    }


}
