package TP2.View;

import javax.swing.*;
import TP2.Controlleur.*;
import TP2.Modele.Data;

public class PanelThanks extends JPanel{

    UIHandler fenetre;
    JLabel thanks;

    public PanelThanks(UIHandler fenetre, Data data){
        this.fenetre = fenetre;
        thanks = new JLabel("Vous émettez entre " + data.getMinConso() + " et " + data.getMaxConso() + " kg de CO2 par semaine.");
        add(thanks);
        new ControllerButtons(fenetre, null, this);
    }
}
