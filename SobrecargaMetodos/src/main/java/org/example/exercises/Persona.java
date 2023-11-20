package org.example.exercises;

public class Persona {
    //ATTRIBUTES
    String nombre;
    int edad;
    int dni;

    //METHODS

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int dni) { //THIS IS METHODS OVERLOADING. WHEN WE HAVE MORE THAN ONE CONSTRUCTOR.
        this.dni = dni;
    }

    public void correr(){
        System.out.println("My name is "+nombre+" I am "+edad+" years old and I'm running a marathon.");
    }

    public void correr(int km){
        System.out.println("I've run "+km+" kilometers."); // THE DIFFERENCE BETWEEN THEM IS THE QUANTITY OF PARAMETERS.
    }
}
