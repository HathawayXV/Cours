package EX07.ecouteurPerimetre;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import EX07.panelPerimetre;

import java.awt.event.*;

public class EcouteurPermetre extends JPanel implements ActionListener {
    panelPerimetre fenetre;
    JButton bouton;
    JButton Nettoyer;
    JLabel Resultat;
    int v1;
    int v2;
    final static String CALCULER_PERIMETRE = "CALCULER";
    final static String NETTOYER_PERIMETRE = "NETTOYER";

    public EcouteurPermetre(panelPerimetre fenetre){
        this.fenetre = fenetre;
        Nettoyer = new JButton("Nettoyer");
        bouton = new JButton("Calculer");
        Resultat = new JLabel("0");

        bouton.addActionListener(this);
        bouton.setActionCommand(CALCULER_PERIMETRE);

        Nettoyer.addActionListener(this);
        Nettoyer.setActionCommand(NETTOYER_PERIMETRE);

        fenetre.add(Resultat);
        fenetre.add(bouton);
        fenetre.add(Nettoyer);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(CALCULER_PERIMETRE)){
            this.v1 = Integer.parseInt(fenetre.txtLargeur.getText());
            this.v2 = Integer.parseInt(fenetre.txtlongueur.getText());
            Resultat.setText(((v1 + v2) * 2) + "");
        }
        if(e.getActionCommand().equals(NETTOYER_PERIMETRE)){
            Resultat.setText("0");
            fenetre.txtlongueur.setText("0");
            fenetre.txtLargeur.setText("0");
        }
    }
}
