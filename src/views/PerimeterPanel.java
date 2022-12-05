/*
* File: PerimeterPanel.java
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

public class PerimeterPanel extends JPanel{
    JLabel perimeterLabel;
    public JTextField perimeterField;
    public PerimeterPanel() { 
        this.perimeterLabel = new JLabel("Kerület");
        this.perimeterField = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.addComponents();
    }
    public void addComponents() {
        this.add(this.perimeterLabel);
        this.add(this.perimeterField);
    }
}
