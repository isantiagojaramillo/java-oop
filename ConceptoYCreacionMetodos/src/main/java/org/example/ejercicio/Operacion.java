package org.example.ejercicio;

import javax.swing.*;

public class Operacion {
    //ATTRIBUTES
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //METHODS

    //ASKING FOR NUMBERS
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
    }

    public void sumar(){
        suma=numero1+numero2;
    }

    public void restar(){
        resta=numero1-numero2;
    }

    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }

    public void dividir(){
        division=numero1/numero2;
    }

    public void mostrarResultados(){
        System.out.println("The add of the numbers is: "+suma);
        System.out.println("The substraction of the numbers is: "+resta);
        System.out.println("The multiplication of the numbers is: "+multiplicacion);
        System.out.println("The division of the numbers is: "+division);
    }
}
