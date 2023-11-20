package org.example.exercises;

public class Persona {
    private final String nombre;
    private int edad;

    //CONSTRUCTOR

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("The name is: "+nombre);
        System.out.println("The age is: "+edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
