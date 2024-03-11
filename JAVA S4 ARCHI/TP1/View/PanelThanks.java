package TP1.View;

import javax.swing.*;
import TP1.Controlleur.*;

public class PanelThanks extends JPanel{

    UIHandler fenetre;
    JLabel thanks = new JLabel("Merci d'avoir joué !");

    public PanelThanks(UIHandler fenetre){
        this.fenetre = fenetre;
        add(thanks);
        new ControllerButtons(fenetre, null, this);
    }
}
