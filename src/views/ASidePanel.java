/*
* File: ASidePanel.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-05
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ASidePanel extends JPanel {
    JLabel aSideLabel;
    public JTextField aSideField;
    public ASidePanel() {
        this.aSideLabel = new JLabel("A oldal:");
        this.aSideField = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.addComponents();
    }
    public void addComponents() {
        this.add(aSideLabel);
        this.add(aSideField);
    }
}
