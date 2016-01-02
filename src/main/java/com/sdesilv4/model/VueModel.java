package com.sdesilv4.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by paard consulting on 02/01/2016.
 */
public class VueModel {

    private static int compteur = 0;
    private static List toutesActions = new LinkedList();

    public static void selectSingleRecordAndFieldByRecordNumber(String choixCACSBF, String choixActionIndice) {
        BasicDBObject whereQuery = new BasicDBObject();

        if(choixCACSBF == "CAC 40"){
            if(choixActionIndice == "Action"){
                ModelGestionIndiceFromYahoo CGi = new ModelGestionIndiceFromYahoo("^FCHI");   //Méthode du modèle permettant de récupérer tous les symboles d'action pour un indice donné depuis l'API Yahoo Finance
                System.out.println(CGi.GetIndex().toString());
            }
            else{

            }
        }
        else if (choixCACSBF == "SBF 250"){
            if(choixActionIndice == "Action"){

            }
            else{

            }
        }
    }

    public int getCompteur(){
        return compteur;
    }

    public List getDonnee(){
        return toutesActions;
    }
}
