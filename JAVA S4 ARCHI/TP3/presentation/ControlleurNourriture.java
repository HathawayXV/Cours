package TP3.presentation;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ControlleurNourriture extends JPanel implements ActionListener{

    JPanel fenetre;
    Presentation presentation;

    JLabel Vegantxt = new JLabel("Vegan :");
    JTextField VeganTF = new JTextField();
    JLabel Vegtxt = new JLabel("Vegetarien :");
    JTextField VegTF = new JTextField();
    JLabel BoeufTxt = new JLabel("Boeuf :");
    JTextField BoeufTF = new JTextField();
    JLabel AutreTxt = new JLabel("Autre :");
    JTextField AutreTF = new JTextField();


    public ControlleurNourriture(JPanel fenetre, Presentation presentation){
        this.fenetre = fenetre;
        this.presentation = presentation;

        VeganTF.setColumns(10);
        VegTF.setColumns(10);
        BoeufTF.setColumns(10);
        AutreTF.setColumns(10);

        fenetre.add(Vegantxt);
        fenetre.add(VeganTF);
        fenetre.add(Vegtxt);
        fenetre.add(VegTF);
        fenetre.add(BoeufTxt);
        fenetre.add(BoeufTF);
        fenetre.add(AutreTxt);
        fenetre.add(AutreTF);

        JButton suivant = new JButton("Suivant");
        suivant.addActionListener(this);
        suivant.setActionCommand("ACTION_SUIVANT");

        fenetre.add(suivant);
    }

    public void actionPerformed(ActionEvent e){
        String action = e.getActionCommand();
        if(action.equals("ACTION_SUIVANT")){
            if (VeganTF.getText().equals("") || VegTF.getText().equals("") || BoeufTF.getText().equals("") || AutreTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
                return;
            }
            if (Integer.parseInt(VeganTF.getText()) < 0 || Integer.parseInt(VegTF.getText()) < 0 || Integer.parseInt(BoeufTF.getText()) < 0 || Integer.parseInt(AutreTF.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Veuillez entrer des valeurs positives ou null");
                return;
            }

            int Vegan = Integer.parseInt(VeganTF.getText());
            int Vegetarien = Integer.parseInt(VegTF.getText());
            int Boeuf = Integer.parseInt(BoeufTF.getText());
            int Autre = Integer.parseInt(AutreTF.getText());

            ArrayList<Integer> quantite = new ArrayList<Integer>();
            quantite.add(Vegan);
            quantite.add(Vegetarien);
            quantite.add(Boeuf);
            quantite.add(Autre);

            presentation.changePanel(quantite);
        }
    }
}
