package EX07;

import javax.swing.*;

import EX07.ecouteurPerimetre.EcouteurPermetre;

import java.awt.*;

public class panelPerimetre extends JPanel{
    int MAX_TXT = 20;
    JLabel longueur;
    public JTextField txtlongueur;
    JLabel Largeur;
    public JTextField txtLargeur;
    JLabel lblresultat;

    public panelPerimetre(){
        setLayout(new GridLayout(4, 2));

        longueur = new JLabel("Longueur:");
        txtlongueur = new JTextField("0");
        Largeur = new JLabel("Largeur:");
        txtLargeur = new JTextField("0");
        lblresultat = new JLabel("resultat :");

        JPanel longueurPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        longueurPanel.add(longueur);

        JPanel largeurPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        largeurPanel.add(Largeur);

        JPanel resultatPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultatPanel.add(lblresultat);

        txtlongueur.setColumns(MAX_TXT);
        txtLargeur.setColumns(MAX_TXT);

        add(longueurPanel);
        add(txtlongueur);
        add(largeurPanel);
        add(txtLargeur);
        add(resultatPanel);
        EcouteurPermetre ecouteur = new EcouteurPermetre(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("perimetre");
        panelPerimetre p = new panelPerimetre();
        frame.add(p);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
