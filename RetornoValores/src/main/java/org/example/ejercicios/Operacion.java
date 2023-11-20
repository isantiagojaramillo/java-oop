package org.example.ejercicios;

public class Operacion {
    public int sumar(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }

    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }

    public int multiplicar(int numero1, int numero2){
        int multiplicacion=numero1*numero2;
        return multiplicacion;
    }

    public int dividir(int numero1, int numero2){
       int division=numero1/numero2;
       return division;
    }

    /*
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("The add of the numbers is: "+suma);
        System.out.println("The substraction of the numbers is: "+resta);
        System.out.println("The multiplication of the numbers is: "+multiplicacion);
        System.out.println("The division of the numbers is: "+division);
    }

     */
}
