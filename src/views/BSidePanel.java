/*
* File: BSidePanel.java
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

public class BSidePanel extends JPanel {
    JLabel bSideLabel;
    public JTextField bSideField;
    public BSidePanel() {
        this.bSideLabel = new JLabel("B oldal:");
        this.bSideField = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.addComponents();
    }
    public void addComponents() {
        this.add(bSideLabel);
        this.add(bSideField);
    }
}
