package EX07;

import javax.swing.*;

import EX07.ecouteurCalculus.BoutonCalcule;

import java.awt.*;

public class panelCalculus extends JPanel {

    public static JLabel result = new JLabel("0");
    Clavier clavier = new Clavier(this);

    public panelCalculus(){
        setBackground(Color.black);
        result.setForeground(Color.green);
        result.setFont(new Font(result.getFont().getName(), Font.PLAIN, 60));
        setLayout(new BorderLayout());
        add(result, BorderLayout.NORTH);
        add(clavier);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("perimetre");
        panelCalculus p = new panelCalculus();
        frame.add(p);
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/**
 * Resultat extends JLabel
 */
class Clavier extends JPanel{

    public Clavier(JPanel panel){
        setLayout(new GridLayout(4,4));
        BoutonCalcule b = new BoutonCalcule(panel, this);
        //Operation op = new Operation(this);
    }
}
