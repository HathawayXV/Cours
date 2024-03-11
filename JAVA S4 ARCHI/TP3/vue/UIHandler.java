package TP3.vue;
import java.awt.*;

import javax.swing.*;
import TP3.modele.*;
import TP3.presentation.Presentation;

public class UIHandler extends JFrame{

    CardLayout card;
    Container c;
    Presentation presentation;

    public UIHandler(Presentation presentation) {
        this.presentation = presentation;
        // this.data = data;

        c = getContentPane(); // BulkCard inherits from JFrame, get the actual frame id
        card = new CardLayout();
        c.setLayout(card);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 100);
        this.setLocationRelativeTo(null); // Start the window in the middle of the screen
        this.setVisible(true);

        PanelWelcome panelWelcome = new PanelWelcome(this, presentation);
        PanelTransport panelTransport = new PanelTransport(this, presentation);
        PanelNourriture panelNourriture = new PanelNourriture(this, presentation);
        c.add(panelWelcome);
        c.add(panelTransport);
        c.add(panelNourriture);
    }

    public void changePanel(Donnees donnee){
        if (donnee == null) {
            card.next(c);
        }
        else if (donnee.getMinConso() == -1.0) {
            c.remove(c.getComponentCount() - 1);
            card.first(c);
        }
        else {
            PanelThanks panelThanks = new PanelThanks(this, presentation, donnee);
            c.add(panelThanks);
            card.next(c);
        }
    }
}
