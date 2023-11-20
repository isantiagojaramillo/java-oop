package org.example;

import org.example.ejercicio.Operacion;

public class Main {
    public static void main(String[] args) {
        // CREATING AN OBJECT
        Operacion op = new Operacion();

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}