package org.example;

import org.example.ejercicios.Operacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n1;
        int n2;
        System.out.println("Enter a number");
        n1=keyboard.nextInt();
        System.out.println("Enter a number");
        n2=keyboard.nextInt();

        Operacion op = new Operacion();

        /*
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int mult = op.multiplicar(n1, n2);
        int div = op.dividir(n1, n2);
        op.mostrarResultados(suma, resta, mult, div);

         */

        System.out.println("The add is: "+op.sumar(n1, n2));
        System.out.println("The substraction is: "+op.restar(n1, n2));
        System.out.println("The multiplication is: "+op.multiplicar(n1, n2));
        System.out.println("The division is: "+op.dividir(n1, n2));

    }
}