package uta.cse.cse3310.JSBSimEdit.ui.components;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aerodynamics extends JPanel {
    public Aerodynamics() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel panel = new JPanel();
        JLabel ex = new JLabel("This is just an panel");
        panel.add(ex);
        CollapsablePanel aerodynamics = new CollapsablePanel("Aerodynamics", panel);
        add(aerodynamics);
    }
}
