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
    //private JButton boutonFermer = new JButton("Fermer");
    private static JButton boutonDetail = new JButton("Details");
    //Instanciation d'un Label
    private static JLabel labelChoix = new JLabel("Choix : ");
    //Instanciation d'un comboBox
    private static JComboBox choixCACSBF = new JComboBox();
    private static JComboBox listeAction = new JComboBox();

    public Fenetre() {
        jPan.setLayout(null);
        //Définir un titre pour la fenêtre
        this.setTitle("Projet Finance");
        //Définir sa taille
        this.setSize(390, 300);
        //Positionner la fenêtre au centre de la fenêtre
        this.setLocationRelativeTo(null);
        //Terminer le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Rendre visible la fenêtre
        this.setVisible(true);
        //Empêcher le redimensionnement de la fenêtre
        this.setResizable(false);
        // Changer couleur de la fenêtre
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
        choixCACSBF.addItem("CAC 40"); //Insérer des valeurs dans le comboBox
        choixCACSBF.addItem("SBF 250");
        choixCACSBF.setVisible(true);
        jPan.add(choixCACSBF);

        boutonValider.setBounds(240, 20, 100, 40);
        jPan.add(boutonValider);

        listeAction.setBounds(40, 100, 300, 40);
        jPan.add(listeAction);

        boutonDetail.setBounds(150, 180, 100, 40);
        jPan.add(boutonDetail);

        boutonDetail.addActionListener(new BoutonDesActions());

        jPan.setBackground(Color.WHITE);
        this.setVisible(true);
    }

    public String getComboBox_choixCACSBF(){
        return (String) choixCACSBF.getSelectedItem(); // Permet de récupérer la valeur String du ComboBox
    }

    public String getComboBox_choixAction(){
        return (String) listeAction.getSelectedItem(); // Permet de récupérer la valeur String du ComboBox
    }

    public void addPremierListener(ActionListener listenPremierBouton){
        boutonValider.addActionListener(listenPremierBouton);
    }

    public void addDeuxiemeListener(ActionListener listenDeuxiemeListener){
        boutonDetail.addActionListener(listenDeuxiemeListener);
    }

    // Action au déclenchement d'un evenement
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== boutonValider)
            if(choixCACSBF.getSelectedItem().toString() == "CAC 40"){
                // action si CAC 40
                // par exemple on veut afficher le tableau dans une nouvelle fenetre
                //  actions.setVisible(true);

            }else if(choixCACSBF.getSelectedItem().toString() == "SBF 120"){
                // action si SBF 120
            }
    }

    class BoutonDesActions implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (choixCACSBF.getSelectedIndex() == 0) {
                new TableauIndice().setVisible(true);
            } else if (choixCACSBF.getSelectedIndex() == 1) {
                new TableauIndice().setVisible(true);
            }
        }
    }

    public void messageErreur(String messageErreur){

        JOptionPane.showMessageDialog(this, messageErreur);
    }

    public void setComboBoxListeActions(String actions){
        listeAction.addItem(actions);
    }


}
