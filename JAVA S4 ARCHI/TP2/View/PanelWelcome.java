package TP2.View;
import javax.swing.*;
import TP2.Controlleur.*;

public class PanelWelcome extends JPanel{

    UIHandler fenetre;
    JLabel welcome = new JLabel("Bienvenue !");

    public PanelWelcome(UIHandler fenetre){
        this.fenetre = fenetre;
        add(welcome);
        new ControllerButtons(fenetre, this, null);
    }
}
