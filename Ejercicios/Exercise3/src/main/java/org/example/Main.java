/*
    Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los
    atributos necesarios que se requieren, proporcione métodos de consulta, un método constructor
    e implemente métodos para calcular el perímetro y el área de un triángulo, además implementar
    un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.
 */

package org.example;

import org.example.Exercises.Triangulo_Isosceles;

import java.util.Scanner;

public class Main {

    //methods
    public static double majorArea(Triangulo_Isosceles triangulos[]){
            double area;

            area= triangulos[0].obtenerArea();

        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area=triangulos[i].obtenerArea();
            }
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, lado;
        int nTriangulos;

        System.out.println("Enter the quantity of triangles");
        nTriangulos = input.nextInt();

        //OBJECTS CONSTRUCTOR
        Triangulo_Isosceles  triangulos[] = new Triangulo_Isosceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("Enter the base");
            base=input.nextDouble();
            System.out.println("Enter the side");
            lado = input.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base, lado);

            System.out.println("The perimeter is: "+triangulos[i].obtenerPerimetro());
            System.out.println("The area is: "+triangulos[i].obtenerArea());

        }

        System.out.println("The triangle with major area is: "+majorArea(triangulos));

    }
}
















