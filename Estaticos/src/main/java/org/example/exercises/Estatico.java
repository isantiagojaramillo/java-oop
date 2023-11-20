//STATIC MEMBERS OF A CLASS

//THE MEMBERS OF A CLASS ARE THE ATTRIBUTES AND THE METHODS.

package org.example.exercises;

public class Estatico {
    //ATTRIBUTES
    // WHEN WE ADD STATIC TO THE ATTRIBUTES OR METHODS, THESES WILL BELONG TO THE CLASS ITSELF AND NOT THE CONSTRUCTORS
    private static String frase = "Primera frase";

    public static int suma(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }

    public static void main(String[] args) {
        /*
        Estatico objeto1 = new Estatico();
        Estatico objeto2 = new Estatico();

        System.out.println(objeto1.frase);

        objeto2.frase = "Segunda frase";
        System.out.println(objeto2.frase);

         */

        System.out.println(Estatico.frase);
        System.out.println("The addition is: "+Estatico.suma(5, 5));
    }
}
