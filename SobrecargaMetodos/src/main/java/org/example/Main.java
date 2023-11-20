package org.example;

import org.example.exercises.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Santi", 23);
        persona1.correr();

        Persona persona2 = new Persona(1452786148);
        persona2.correr(100);
    }
}