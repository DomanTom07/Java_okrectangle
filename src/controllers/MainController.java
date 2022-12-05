/*
* File: MainController.java
* Created Date: 2020-09-15
* Author: Nagy János
* Github: https://github.com/andteki
* Copyright (c) 2020-2022 Nagy János
* 
* GNU GPL v2
*/

/*
* File: MainController.java
* Refactoring: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-05
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package controllers;

import javax.swing.JOptionPane;

import models.FileHandler;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.buttonsPanel.calcButton.addActionListener(e -> {
            this.onClickCalcButton();
        });
        this.mainWindow.buttonsPanel.aboutButton.addActionListener(e -> {
            this.onClickAboutButton();
        });
    }
    public void onClickCalcButton() {
        double aSide = Double.parseDouble(this.mainWindow.aSidePanel.aSideField.getText());
        double bSide = Double.parseDouble(this.mainWindow.bSidePanel.bSideField.getText());
        Double perimeter = CalcController.calcPerimeter(aSide, bSide);
        Double area = CalcController.calcArea(aSide, bSide);
        showResult(perimeter, area);
        saveToFile(perimeter, area);
    }
    public void showResult(Double perimeter, Double area) {
        this.mainWindow.perimeterPanel.perimeterField.setText(perimeter.toString());
        this.mainWindow.areaPanel.areaField.setText(area.toString());
    }
    public void saveToFile(Double perimeter, Double area) {
        String line = perimeter.toString() + ":" + area.toString();
        FileHandler fileHandler = new FileHandler();
        fileHandler.writeFile(line);
    }
    public void onClickAboutButton() {
        JOptionPane.showMessageDialog(null, "Készítette: Nagy János, Refaktorálta: Tamás Domán");
    }
}
