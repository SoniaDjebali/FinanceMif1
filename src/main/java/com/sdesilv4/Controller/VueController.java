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

    private Fenetre maVue;
    private VueModel monModele;

    public VueController(Fenetre maVue, VueModel monModele){

        this.maVue = maVue;
        this.monModele = monModele;

        this.maVue.addPremierListener(new PremierListener());
    }

    class PremierListener implements ActionListener {  // pour le bouton Valider
        public void actionPerformed(ActionEvent e) {

            String valueChoixCACSBF;
            String valueChoixActionIndice;

            valueChoixCACSBF = maVue.getComboBox_choixCACSBF(); // valeur du comboBox
            valueChoixActionIndice = maVue.getComboBox_choixActionIndice(); // valeur du combobox

            int i = 0;

            try {

                monModele.selectSingleRecordAndFieldByRecordNumber(valueChoixCACSBF, valueChoixActionIndice); // Utilisation de la m�thode

                for(i=0; i<monModele.getCompteur(); i++) {
                    maVue.setComboBoxListeActions((String) monModele.getDonnee().get(i));  // rempli la ComboBox des r�sultats
                }

            }
            catch(NumberFormatException exception){

                maVue.messageErreur("Erreur !");
            }
        }
    }
}
