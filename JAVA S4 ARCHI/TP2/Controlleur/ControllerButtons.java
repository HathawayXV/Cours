package TP2.Controlleur;
import javax.swing.*;
import java.awt.event.*;

import TP2.View.*;

public class ControllerButtons extends JPanel implements ActionListener{

    UIHandler fenetre;
    PanelWelcome fenetre1;
    PanelThanks fenetre2;

    JButton nouveau = new JButton("Nouveau");
    JButton commencer = new JButton("Commencer");
    static public final String ACTION = "ACTION";

    public ControllerButtons(UIHandler fenetre, PanelWelcome fenetre1, PanelThanks fenetre2){
        this.fenetre = fenetre;
        this.fenetre1 = fenetre1;
        this.fenetre2 = fenetre2;

        nouveau.setActionCommand(ACTION);
        commencer.setActionCommand(ACTION);
        nouveau.addActionListener(this);
        commencer.addActionListener(this);

        if (fenetre1 != null) {
            add(commencer);
            fenetre1.add(commencer);
        }
        else if (fenetre2 != null) {
            add(nouveau);
            fenetre2.add(nouveau);
        }
    }

    public void actionPerformed(ActionEvent e){
        fenetre.changePanel(null);
    }
}

