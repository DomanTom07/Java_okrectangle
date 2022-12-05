/*
* File: CalcController.java
* Created Date: 2020-09-15
* Author: Nagy János
* Github: https://github.com/andteki
* Copyright (c) 2020-2022 Nagy János
* 
* GNU GPL v2
*/

/*
* File: CalcController.java
* Refactoring: Tamás Domán
* Copyright: 2022, Tamás Domán
* Group: Szoft II N
* Date: 2022-12-05
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package controllers;

public class CalcController {
    public static double calcPerimeter(double aSide, double bSide) {
        return (aSide + bSide) * 2;
    }
    public static double calcArea(double aSide, double bSide) {
        return aSide * bSide;
    }
}
