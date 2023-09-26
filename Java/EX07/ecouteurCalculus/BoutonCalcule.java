package EX07.ecouteurCalculus;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.xml.transform.Templates;

import EX07.panelCalculus;

public class BoutonCalcule extends JButton implements ActionListener{
    int compte = 1;
    JPanel Fenetre;
    JPanel clavier;
    JButton temp;
    boolean changement = false;
    int valeur1;
    int valeur2;
    int res;
    final static String ADD_CALCULATRICE = "ADDCALCULATRICE";
    boolean add = false;
    boolean sub = false;
    boolean mul = false;
    boolean div = false;
    private static final String SUB_CALCULATRICE = "SUBCALCULATRICE";
    private static final String MUL_CALCULATRICE = "MULCALCULATRICE";
    private static final String DIV_CALCULATRICE = "DIVCALCULATRICE";
    private static final String BASE_CALCULATRICE = "BASECALCULATRICE";
    private static final String EGAL_CALCULATRICE = "EGALCALCULATRICE";
    private static final String EFFACER_CALCULATRICE = "EFFACERCALCULATRICE";

    public BoutonCalcule(JPanel panel, JPanel clavier){
        this.Fenetre = panel;
        this.clavier = clavier;
        for(int i = 0; i < 12; i++){
            if(i <= 8){
                if (i == 3){
                    temp = new JButton("+");
                    temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                    temp.addActionListener(this);
                    temp.setActionCommand(ADD_CALCULATRICE);
                    clavier.add(temp);
                }
                else if (i == 6){
                    temp = new JButton("-");
                    temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                    temp.addActionListener(this);
                    temp.setActionCommand(SUB_CALCULATRICE);
                    clavier.add(temp);
                }

                temp = new JButton(compte + "");
                temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                temp.addActionListener(this);
                temp.setActionCommand(BASE_CALCULATRICE);
                clavier.add(temp);
            }
            else if(i == 9){
                temp = new JButton("x");
                temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                temp.addActionListener(this);
                temp.setActionCommand(MUL_CALCULATRICE);
                clavier.add(temp);

                temp = new JButton("C/CE");
                temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                temp.addActionListener(this);
                temp.setActionCommand(EFFACER_CALCULATRICE);
                clavier.add(temp);
            }
            else if(i == 10){
                temp = new JButton("0");
                temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                clavier.add(temp);
            }
            else{
                temp = new JButton("=");
                temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                temp.addActionListener(this);
                temp.setActionCommand(EGAL_CALCULATRICE);
                clavier.add(temp);

                temp = new JButton("/");
                temp.setBorder(BorderFactory.createLineBorder(Color.blue));
                temp.addActionListener(this);
                temp.setActionCommand(DIV_CALCULATRICE);
                clavier.add(temp);
            }
            compte++;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(BASE_CALCULATRICE)){
            JButton source = (JButton) e.getSource();
            String chiffre = source.getText();

            if(changement){
                if(panelCalculus.result.getText().equals("0")){
                    valeur2 = Integer.parseInt(chiffre);
                    panelCalculus.result.setText(chiffre);
                }
                else{
                    valeur2 += Integer.parseInt(chiffre);
                    panelCalculus.result.setText(panelCalculus.result.getText() + chiffre);
                }
            }
            else{
                if(panelCalculus.result.getText().equals("0")){
                    valeur1 = Integer.parseInt(chiffre);
                    panelCalculus.result.setText(chiffre);
                }
                else{
                    valeur1 += Integer.parseInt(chiffre);
                    panelCalculus.result.setText(panelCalculus.result.getText() + chiffre);
                }
            }
            
        }
        if(e.getActionCommand().equals(ADD_CALCULATRICE)){
            panelCalculus.result.setText("0");
            add = true;
            changement = true;
        }
        if(e.getActionCommand().equals(SUB_CALCULATRICE)){
            panelCalculus.result.setText("0");
            sub = true;
            changement = true;
        }
        if(e.getActionCommand().equals(MUL_CALCULATRICE)){
            panelCalculus.result.setText("0");
            mul = true;
            changement = true;
        }
        if(e.getActionCommand().equals(DIV_CALCULATRICE)){
            panelCalculus.result.setText("0");
            div = true;
            changement = true;
        }
        if(e.getActionCommand().equals(EGAL_CALCULATRICE)){
            if(add){
                valeur1 += valeur2;
                panelCalculus.result.setText(valeur1 + "");
                add = false;
            }
            if(sub){
                valeur1 -= valeur2;
                panelCalculus.result.setText(valeur1 + "");
                sub = false;
            }
            if(mul){
                valeur1 *= valeur2;
                panelCalculus.result.setText(valeur1 + "");
                mul = false;
            }
            if(div){
                valeur1 /= valeur2;
                panelCalculus.result.setText(valeur1 + "");
                div = false;
            }
        }
        if(e.getActionCommand().equals(EFFACER_CALCULATRICE)){
            panelCalculus.result.setText("0");
            valeur1 = 0;
            valeur2 = 0;
        }
    }
}
