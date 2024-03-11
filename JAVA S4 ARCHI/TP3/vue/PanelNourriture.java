package TP3.vue;

import javax.swing.*;
import TP3.presentation.*;

public class PanelNourriture extends JPanel{

        UIHandler fenetre;
        Presentation presentation;

        JLabel texte = new JLabel("Indiquez le nombre de repas de chaque type que vous avez consommé par semaine :");

        public PanelNourriture(UIHandler fenetre, Presentation presentation){
            this.fenetre = fenetre;
            this.presentation = presentation;

            add(texte);
            new ControlleurNourriture(this, presentation);
        }
}
