package org.example;
import java.lang.Math;
public class CalculateGallons {
    public int calcArea(int a, int b){
        return a * b;
    }
    public double calcGallons(double a){
        return Math.ceil(a / 350);
    }
}
