/*
* File: AreaPanel.java
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

public class AreaPanel extends JPanel{
    JLabel areaLabel;
    public JTextField areaField;
    public AreaPanel() { 
        this.areaLabel = new JLabel("Terület");
        this.areaField = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.addComponents();
    }
    public void addComponents() {
        this.add(this.areaLabel);
        this.add(this.areaField);
    }
}
