package TP3.vue;

import javax.swing.*;

import TP3.modele.Donnees;
import TP3.presentation.*;

public class PanelThanks extends JPanel{

    UIHandler fenetre;
    Presentation presentation;
    JLabel thanks = new JLabel();

    public PanelThanks(UIHandler fenetre, Presentation presentation, Donnees donnee){
        this.fenetre = fenetre;

        thanks.setText(presentation.getBilan(donnee));;
        add(thanks);

        new ControlleurBonton(this, presentation);
    }

}
