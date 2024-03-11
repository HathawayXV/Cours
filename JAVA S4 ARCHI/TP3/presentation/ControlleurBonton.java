package TP3.presentation;

import javax.swing.*;
import TP3.vue.PanelThanks;
import java.awt.event.*;

public class ControlleurBonton extends JPanel implements ActionListener{

    JPanel fenetre;
    Presentation presentation;

    JButton continuer = new JButton("Commencer");
    JButton recommencer = new JButton("Recommencer");
    static public final String ACTION_COMMENCER = "ACTION_COMMENCER";
    static public final String ACTION_RECOMMENCER = "ACTION_RECOMMENCER";

    public ControlleurBonton(JPanel fenetre, Presentation presentation){
        this.fenetre = fenetre;
        this.presentation = presentation;

        if (fenetre instanceof PanelThanks) {
            recommencer.setActionCommand(ACTION_RECOMMENCER);
            recommencer.addActionListener(this);
            fenetre.add(recommencer);
        }
        else {
            continuer.setActionCommand(ACTION_COMMENCER);
            continuer.addActionListener(this);
            fenetre.add(continuer);
        }
    }

    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();
        if(action.equals(ACTION_COMMENCER)){
            presentation.changePanel(ACTION_COMMENCER);
        }
        else if(action.equals(ACTION_RECOMMENCER)){
            presentation.changePanel(ACTION_RECOMMENCER);
        }
    }
}
