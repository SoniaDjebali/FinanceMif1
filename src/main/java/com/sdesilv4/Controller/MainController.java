package com.sdesilv4.Controller;

import com.sdesilv4.model.ModelGestionIndiceFromYahoo;

/**
 * Created by Victor on 29/11/15.
 */
public class MainController {
    public static void main(String[] args){
        ModelGestionIndiceFromYahoo CGi = new ModelGestionIndiceFromYahoo("^FCHI");   //Méthode du modèle permettant de récupérer tous les symboles d'action pour un indice donné depuis l'API Yahoo Finance
        System.out.println(CGi.GetIndex().toString());
        System.out.println("Hello");
        MongoDBClient mongoDBClient = new MongoDBClient("mongodb://groupeMif1:groupeMif1@ds051524.mongolab.com:51524/actif");
        System.out.println("Hello1");
        mongoDBClient.AddIndice(CGi.GetIndex());
        System.out.println("Hello2");
        mongoDBClient.GetAction_Indice("^FCHI");
        System.out.println("Hello2");
        mongoDBClient.CloseClientConnection();
        // Commande Bash        mongo ds051524.mongolab.com:51524/actif -u groupeMif1 -p groupeMif1
    }
}
