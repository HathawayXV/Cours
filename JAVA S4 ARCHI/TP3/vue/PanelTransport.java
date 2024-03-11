package TP3.vue;

import javax.swing.JLabel;
import javax.swing.JPanel;

import TP3.presentation.ControlleurNourriture;
import TP3.presentation.ControlleurTransport;
import TP3.presentation.Presentation;

public class PanelTransport extends JPanel{

    UIHandler fenetre;
    Presentation presentation;

    JLabel texte = new JLabel("Quel moyen de transport utilisez-vous ? ");

    public PanelTransport(UIHandler fenetre, Presentation presentation){
        this.fenetre = fenetre;
        this.presentation = presentation;

        add(texte);
        new ControlleurTransport(this, presentation);
    }

}
