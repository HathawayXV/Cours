package TP2.View;
import javax.swing.*;
import TP2.Controlleur.*;

public class PanelComing extends JPanel {

    UIHandler fenetre;
    JLabel coming = new JLabel("Transport pour venir a l'IUT");
    public PanelComing(UIHandler fenetre) {
        this.fenetre = fenetre;
        add(coming);
        new ControllerTransport(this.fenetre, this);
    }
}
