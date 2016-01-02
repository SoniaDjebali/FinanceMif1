package com.sdesilv4.gui;

import com.sdesilv4.Controller.VueController;
import com.sdesilv4.model.VueModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Created by sonia on 02/11/2015.
 */

public class FinanceApp {
    public static void main(String[] args) {
        Fenetre laVue = new Fenetre();
        VueModel leModele = new VueModel();
        VueController leControleur = new VueController(laVue, leModele);
        laVue.setVisible(true);

    }
}
/**
 * Created by sonia on 02/11/2015.
 */

