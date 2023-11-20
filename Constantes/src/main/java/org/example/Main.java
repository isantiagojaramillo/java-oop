package org.example;

import org.example.exercises.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Santi", 23);

        
        persona1.setEdad(24);
        persona1.mostrarDatos();
    }
}