/*
    Construir un programa que calcule el área y el perimetro de un
    cuadrilatero dada la longitud de us lados. Los valores de la longitud deberán
    introducirse por lineas de ordenes. Si es un cuadrado, solo se proporcionará la
    longitud de uno de los lados al constructor.
 */

package org.example.exercises;

public class Cuadrilatero {
        //ATTRIBUTES
    private float lado1;
    private float lado2;

    //METHODS
    //CONSTRUCTOR 1
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //CONSTRUCTOR 2

    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea(){
        float area = lado1*lado2;
        return area;
    }
}
