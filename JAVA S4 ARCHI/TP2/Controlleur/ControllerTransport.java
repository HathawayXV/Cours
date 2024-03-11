package TP2.Controlleur;
import javax.swing.*;
import TP2.View.*;

import java.awt.event.*;

public class ControllerTransport extends JPanel implements ActionListener{

    UIHandler fenetre;
    PanelComing fenetre1;

    JButton voiture = new JButton("Voiture");
    static public final String ACTION_VOITURE = "ACTION_VOITURE";

    JButton coVoiturage = new JButton("Co-Voiturage");
    static public final String ACTION_COVOITURAGE = "ACTION_COVOITURAGE";

    JButton velo = new JButton("Velo");
    static public final String ACTION_VELO = "ACTION_VELO";

    JButton transport = new JButton("Transport en commun");
    static public final String ACTION_TRANSPORT = "ACTION_TRANSPORT";

    JButton Autre = new JButton("Autre");
    static public final String ACTION_AUTRE = "ACTION_AUTRE";

    public ControllerTransport(UIHandler fenetre2, PanelComing panelComing){
        this.fenetre = fenetre2;
        this.fenetre1 = panelComing;

        voiture.setActionCommand(ACTION_VOITURE);
        coVoiturage.setActionCommand(ACTION_COVOITURAGE);
        velo.setActionCommand(ACTION_VELO);
        transport.setActionCommand(ACTION_TRANSPORT);
        Autre.setActionCommand(ACTION_AUTRE);

        voiture.addActionListener(this);
        coVoiturage.addActionListener(this);
        velo.addActionListener(this);
        transport.addActionListener(this);
        Autre.addActionListener(this);

        fenetre1.add(voiture);
        fenetre1.add(coVoiturage);
        fenetre1.add(velo);
        fenetre1.add(transport);
        fenetre1.add(Autre);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals(ACTION_VOITURE)) {
            fenetre.changePanel("Voiture");
        }
        else if (e.getActionCommand().equals(ACTION_COVOITURAGE)) {
            fenetre.changePanel("Co-Voiturage");
        }
        else if (e.getActionCommand().equals(ACTION_VELO)) {
            fenetre.changePanel("Velo");
        }
        else if (e.getActionCommand().equals(ACTION_TRANSPORT)) {
            fenetre.changePanel("Transport en commun");
        }
        else if (e.getActionCommand().equals(ACTION_AUTRE)) {
            fenetre.changePanel("Autre");
        }
    }
}
