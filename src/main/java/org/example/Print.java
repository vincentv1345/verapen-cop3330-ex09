package org.example;


public class Print {
    public void printfunction(){
        getVariables var = new getVariables();
        CalculateGallons gal = new CalculateGallons();
        int length = var.getLength();
        int width = var.getWidth();
        int area = gal.calcArea(length, width);
        double gallon = gal.calcGallons(area);
        System.out.println("You will need " + gallon + " gallons of paint to cover " + area + " square feet.");
    }
}
