package org.example.Exercises;

public class Triangulo_Isosceles {
    //ATTRIBUTES
    private double base;
    private double lado;

    //CONSTRUCTOR
    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    // METHODS

    public double obtenerPerimetro(){
        double perimetro = 2*lado;
        return perimetro;
    }

    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado) - ((base*base)/4))) /2;
        return area;
    }

    public String mostrarDatos(){
        return "Base: "+base+"\n Lado: "+lado+"\n Perimetro: "+obtenerPerimetro()+"\n Area: "+obtenerArea();
    }
}
