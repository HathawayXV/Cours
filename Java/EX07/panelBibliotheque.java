package EX07;

import javax.swing.*;
import java.awt.*;

public class panelBibliotheque extends JPanel {

    String[] elements = {"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"};
    JList<String> livre;
    JScrollPane scrollPane;
    JTextArea textArea;
    JLabel info = new JLabel("Info : ");
    JLabel Liste_ouvrage = new JLabel("Liste Ouvrage :");

    panelBibliotheque(){
        setLayout(new GridLayout(1, 2, 2, 2));
        livre = new JList<>(elements);
        livre.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        livre.setLayoutOrientation(JList.VERTICAL);
        livre.setVisibleRowCount(-1);

        scrollPane = new JScrollPane(livre);

        textArea = new JTextArea();

        add(Liste_ouvrage, BorderLayout.NORTH);
        add(scrollPane);
        add(info);
        add(textArea);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("perimetre");
        panelBibliotheque f = new panelBibliotheque();
        frame.add(f);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
