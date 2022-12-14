/*
* File: ButtonsPanel.java
* Author: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-05
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
    public JButton calcButton;
    public JButton aboutButton;
    public ButtonsPanel() {
        this.calcButton = new JButton("Számít");
        this.aboutButton = new JButton("Névjegy");
        this.addComponents();
    }
    public void addComponents() {
        this.add(this.calcButton);
        this.add(this.aboutButton);
    }
}