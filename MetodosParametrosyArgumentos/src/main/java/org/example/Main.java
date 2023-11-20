package org.example;

import org.example.ejercicios.Operacion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;

        n1=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarResultados();
    }
}