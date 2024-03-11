package TP3.vue;

import javax.swing.*;

import TP3.presentation.ControlleurBonton;
import TP3.presentation.Presentation;

public class PanelWelcome extends JPanel{

    UIHandler fenetre;
    Presentation presentation;
    JLabel welcome = new JLabel("Bienvenue !");

    public PanelWelcome(UIHandler fenetre, Presentation presentation){
        this.fenetre = fenetre;
        this.presentation = presentation;
        add(welcome);
        new ControlleurBonton(this, presentation);
    }
}
