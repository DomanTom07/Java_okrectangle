/*
* File: MainWindow.java
* Created Date: 2020-09-15
* Author: Nagy János
* Github: https://github.com/andteki
* Copyright (c) 2020-2022 Nagy János
* 
* GNU GPL v2
*/

/*
* File: MainWindow.java
* Refactoring: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-05
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
    public JLabel titleLabel;
    public ASidePanel aSidePanel;   
    public BSidePanel bSidePanel;
    public ButtonsPanel buttonsPanel;
    public PerimeterPanel perimeterPanel;
    public AreaPanel areaPanel;
    public JLabel aboutLabel;
    /*
    * Az oldal és b oldal bekérése egyetlen felhasználói felületen 
    * történik. Középen lesz két gomb. Az egyik a számító, másik
    * a névjegy gomb.
    */
    public MainWindow() {
        initComponents();

        addComponentsToWindow();

        initWindow();
    }
    private void initComponents() {
        this.titleLabel = new JLabel("Téglalap kerület, terület");
        this.aSidePanel = new ASidePanel();
        this.bSidePanel = new BSidePanel();
        this.buttonsPanel = new ButtonsPanel();
        this.perimeterPanel = new PerimeterPanel();
        this.areaPanel = new AreaPanel();
        this.aboutLabel = new JLabel("Tamás Domán, Szoft II N, 2022-12-05");
    }
    public void addComponentsToWindow() {
        this.add(this.titleLabel);
        this.add(this.aSidePanel);
        this.add(this.bSidePanel);
        this.add(this.buttonsPanel);
        this.add(this.perimeterPanel);
        this.add(this.areaPanel);
        this.add(this.aboutLabel);
    }
    public void initWindow() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }    
}
