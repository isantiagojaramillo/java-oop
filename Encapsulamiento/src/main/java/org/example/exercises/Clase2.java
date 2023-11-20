package org.example.exercises;

public class Clase2 {

    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();

        objeto1.setEdad(23);
        System.out.println("I am "+objeto1.getEdad()+" years old");

        objeto1.setNombre("Santi");
        System.out.println("The name is: "+objeto1.getNombre());
    }
}
