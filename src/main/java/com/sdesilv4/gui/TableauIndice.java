package com.sdesilv4.gui;
import javax.swing.*;
import javax.swing.JFrame;

/**
 * Created by Sabrina on 20/11/2015.
 */
public class TableauIndice extends JFrame{
    
    private JButton boutonPrev = new JButton("Previous");

    public TableauIndice(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTable");
        this.setSize(800, 180);
        this.setLocationRelativeTo(null);

 JTable table = new JTable(10, 4);
        Object[][] valeur = {
                //Exemple de valeurs possibles
                {"BNP Paribas", "BNP.PA", "56.55", "-1.51", "2 708 045", "19/11/15"},
                {"Societe Generale Group", "GLE.PA", "44.24", "-1.23","2 024 429", "19/11/15" },
                {"ENGIE SA", "GSZ.PA", "17.56", "3.97", "4 458 401", "19/11/15"}

        };

        String indiceTitle[] = {"Indice", "Symbole", "Prix","Variation(%)","Volume", "date"};

        table = new JTable(valeur, indiceTitle);
         JPanel btnPnl = new JPanel(new BorderLayout());
        JPanel topBtnPnl = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        JPanel bottombtnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));

        bottombtnPnl.add(boutonPrev);

        boutonPrev.addActionListener(new BoutonPrevCAC());
        btnPnl.add(topBtnPnl, BorderLayout.NORTH);
        btnPnl.add(bottombtnPnl, BorderLayout.CENTER);

        table.getTableHeader().setReorderingAllowed(false);


        this.add(table.getTableHeader(), BorderLayout.NORTH);
       this.add(table, BorderLayout.CENTER);this.add(btnPnl, BorderLayout.SOUTH);

        this.setTitle("JTable");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    class BoutonPrevCAC implements ActionListener {
        public void actionPerformed(ActionEvent argBouton) {
            dispose();

        }
    }

}

        
    }
}
