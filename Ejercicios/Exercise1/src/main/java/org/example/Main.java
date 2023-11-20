package org.example;

import org.example.exercises.Cuadrilatero;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero c1;

        float lado1, lado2;

        lado1=Float.parseFloat(JOptionPane.showInputDialog("Enter the first side"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Enter the second side"));

        if (lado1 == lado2){
            c1 = new Cuadrilatero(lado1);
        }else {
            c1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("The perimeter is: "+c1.getPerimetro());
        System.out.println("The area is: "+c1.getArea());

    }
}