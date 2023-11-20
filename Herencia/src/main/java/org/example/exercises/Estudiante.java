package org.example.exercises;

//EXTENDS tells Java that he is going  to inherit from class Persona
public class Estudiante extends Persona {
        private int codigoEstudiante;
        private float notaFinal;

        // special constructor

        public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){

                // super() tells java these variables are already initialized in class Persona
                super(nombre, apellido, edad);

                this.codigoEstudiante = codigoEstudiante;
                this.notaFinal = notaFinal;
        }

        public void mostrarDatos(){
                System.out.println("Nombre: "+getNombre());
                System.out.println("Apellido: "+getApellido());
                System.out.println("Edad: "+getEdad());
                System.out.println("Codigo Estudiante: "+codigoEstudiante);
                System.out.println("Nota Final: "+notaFinal);

        }
}
