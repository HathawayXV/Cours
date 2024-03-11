package TP3.presentation;

import javax.swing.*;
import java.awt.event.*;

public class ControlleurTransport extends JPanel implements ActionListener{

    JPanel fenetre;
    Presentation presentation;

    JButton Voiture = new JButton("Voiture");
    JButton covoiturage = new JButton("Covoiturage");
    JButton velo = new JButton("Velo");
    JButton transport = new JButton("Transport Commun");
    JButton autre = new JButton("Autre");

    final static String ACTION_VOITURE = "Voiture";
    final static String ACTION_COVOITURAGE = "Co-Voiturage";
    final static String ACTION_VELO = "Velo";
    final static String ACTION_TRANSPORT = "Transport en commun";
    final static String ACTION_AUTRE = "Autre";

    public ControlleurTransport(JPanel fenetre, Presentation presentation){
        this.fenetre = fenetre;
        this.presentation = presentation;

        Voiture.addActionListener(this);
        Voiture.setActionCommand(ACTION_VOITURE);
        covoiturage.addActionListener(this);
        covoiturage.setActionCommand(ACTION_COVOITURAGE);
        velo.addActionListener(this);
        velo.setActionCommand(ACTION_VELO);
        transport.addActionListener(this);
        transport.setActionCommand(ACTION_TRANSPORT);
        autre.addActionListener(this);
        autre.setActionCommand(ACTION_AUTRE);

        fenetre.add(Voiture);
        fenetre.add(covoiturage);
        fenetre.add(velo);
        fenetre.add(transport);
        fenetre.add(autre);
    }

    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();
        if(action.equals(ACTION_VOITURE)){
            presentation.changePanel(ACTION_VOITURE);
        }
        else if(action.equals(ACTION_COVOITURAGE)){
            presentation.changePanel(ACTION_COVOITURAGE);
        }
        else if(action.equals(ACTION_VELO)){
            presentation.changePanel(ACTION_VELO);
        }
        else if(action.equals(ACTION_TRANSPORT)){
            presentation.changePanel(ACTION_TRANSPORT);
        }
        else if(action.equals(ACTION_AUTRE)){
            presentation.changePanel(ACTION_AUTRE);
        }
    }

}
