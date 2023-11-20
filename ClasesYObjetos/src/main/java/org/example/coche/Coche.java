package org.example.coche;

public class Coche {
    //ATTRIBUTES
    String color;
    String marca;
    int km;

    //METHODS
    public static void main(String[] args) {
        //CREATING AN OBJECT
        Coche coche1 = new Coche();

        coche1.color="Blanco";
        coche1.marca="Audi";
        coche1.km=0;

        System.out.println("The color of coche1 is: "+coche1.color);
        System.out.println("The brand of coche1 is: "+coche1.marca);
        System.out.println("The kilometers of coche1 is: "+coche1.km);

        System.out.println(" ");

        Coche coche2 = new Coche();

        coche2.color="Rojo";
        coche2.marca="Ferrari";
        coche2.km=100;

        System.out.println("The color of coche2 is: "+coche2.color);
        System.out.println("The brand of coche2 is: "+coche2.marca);
        System.out.println("The kilometers of coche2 is: "+coche2.km);
    }
}
