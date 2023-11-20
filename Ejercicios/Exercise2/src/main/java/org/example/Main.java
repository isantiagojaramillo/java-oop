/*
    Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca,
    modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberán leer por
    teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
 */

package org.example;

import org.example.Ejercicios.Vehiculo;

import java.util.Scanner;

public class Main {

    public static int indiceVehiculoBarato(Vehiculo vehiculos[]){
            float precio;
            int indice=0;

            precio = vehiculos[0].getPrecio();
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio=vehiculos[i].getPrecio();
                indice=i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int cantVehiculos, indiceBarato;

        System.out.println("Enter the quantity of vehicles");
        cantVehiculos= input.nextInt();

        Vehiculo vehiculos[] = new Vehiculo[cantVehiculos];

        for (int i = 0; i < vehiculos.length; i++) {
            input.nextLine();
            System.out.println("Enter the brand");
            marca = input.next();
            System.out.println("Enter the model");
            modelo = input.next();
            System.out.println("Enter the price");
            precio = input.nextFloat();

            vehiculos[i] = new Vehiculo(marca, modelo, precio);

        }

        indiceBarato = indiceVehiculoBarato(vehiculos);
        System.out.println("The cheapest vehicle is: ");
        System.out.println(vehiculos[indiceBarato].mostrarDatos());

    }
}