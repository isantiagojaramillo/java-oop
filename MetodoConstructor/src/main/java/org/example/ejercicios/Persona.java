package org.example.ejercicios;

public class Persona {
    //ATTRIBUTES
    String nombre;
    int edad;

    //METHODS

    //CONSTRUCTOR METHOD
    public Persona(String nombre, int edad){
        this.nombre=nombre; //this references to the attributes of the class.
        this.edad=edad;
    }

    public void mostrarDatos(){
        System.out.println("The name is: "+nombre);
        System.out.println("The age is: "+edad);
    }
}
