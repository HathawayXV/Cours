package TP2.View;
import java.awt.*;

import javax.swing.*;
import TP2.Modele.*;

public class UIHandler extends JFrame{

    CardLayout card;
    Container c;

    public UIHandler() {
        // this.data = data;

        c = getContentPane(); // BulkCard inherits from JFrame, get the actual frame id
        card = new CardLayout();
        c.setLayout(card);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 100);
        this.setLocationRelativeTo(null); // Start the window in the middle of the screen
        this.setVisible(true);

        PanelComing panelComing = new PanelComing(this);

        c.add(panelComing);
    }

    public void changePanel(String type){
        if (type == "Voiture") {
            Data data = new Data("Voiture", 4.5, 20);
            PanelThanks panelThanks = new PanelThanks(this, data);
            c.add(panelThanks);
        }
        else if (type == "Co-Voiturage") {
            Data data = new Data("Co-Voiturage", 2, 10);
            PanelThanks panelThanks = new PanelThanks(this, data);
            c.add(panelThanks);
        }
        else if (type == "Velo") {
            Data data = new Data("Velo", 0.001, 0.22);
            PanelThanks panelThanks = new PanelThanks(this, data);
            c.add(panelThanks);
        }
        else if (type == "Transport en commun") {
            Data data = new Data("Transport en commun", 0.2, 1.0);
            PanelThanks panelThanks = new PanelThanks(this, data);
            c.add(panelThanks);
        }
        else if (type == "Autre") {
            Data data = new Data("Autre", 0.0, 20);
            PanelThanks panelThanks = new PanelThanks(this, data);
            c.add(panelThanks);
        }
        else {
            PanelComing panelComing = new PanelComing(this);
            c.add(panelComing);
        }
        card.next(c);
    }
}
