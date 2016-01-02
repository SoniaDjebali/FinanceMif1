package com.sdesilv4.Controller;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.sdesilv4.gui.Fenetre;
import com.sdesilv4.model.VueModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by paard consulting on 02/01/2016.
 */
public class VueController {

    private Fenetre laVue;
    private VueModel leModele;

    public VueController(Fenetre laVue, VueModel leModele){

        this.laVue = laVue;
        this.leModele = leModele;

        this.laVue.addPremierListener(new PremierListener());
    }

    class PremierListener implements ActionListener {  // pour le bouton Valider
        public void actionPerformed(ActionEvent e) {

            String valueChoixCACSBF;
            String valueChoixActionIndice;

            valueChoixCACSBF = laVue.getComboBox_choixCACSBF(); // valeur du comboBox
            valueChoixActionIndice = laVue.getComboBox_choixActionIndice(); // valeur du combobox

            int i = 0;

            try {

                leModele.selectSingleRecordAndFieldByRecordNumber(valueChoixCACSBF, valueChoixActionIndice); // Utilisation de la méthode

                for(i=0; i<leModele.getCompteur(); i++) {
                    laVue.setComboBoxListeActions((String) leModele.getDonnee().get(i));  // rempli la ComboBox des résultats
                }

            }
            catch(NumberFormatException exception){

                laVue.messageErreur("Erreur !");
            }
        }
    }
}
