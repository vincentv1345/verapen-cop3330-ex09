package org.example;
import java.util.Scanner;
public class getVariables {
    public int getLength(){
        Scanner len = new Scanner(System.in);
        System.out.println("What is the length of the ceiling? ");
        return len.nextInt();
    }
    public int getWidth(){
        Scanner wid = new Scanner(System.in);
        System.out.println("What is the width of the ceiling? ");
        return wid.nextInt();
    }
}
