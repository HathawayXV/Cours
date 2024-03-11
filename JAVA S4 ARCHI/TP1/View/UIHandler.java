package TP1.View;
import java.awt.*;
import javax.swing.*;

public class UIHandler extends JFrame{

    PanelWelcome panelWelcome;
    PanelThanks panelThanks;

    CardLayout card;
    Container c;

    public UIHandler() {
        c = getContentPane(); // BulkCard inherits from JFrame, get the actual frame id
        card = new CardLayout();
        c.setLayout(card);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 100);
        this.setLocationRelativeTo(null); // Start the window in the middle of the screen
        this.setVisible(true);

        PanelWelcome panelWelcome = new PanelWelcome(this);
        PanelThanks panelThanks = new PanelThanks(this);

        c.add(panelWelcome);
        c.add(panelThanks);
    }

    public void changePanel(){
        card.next(c);
    }
}
