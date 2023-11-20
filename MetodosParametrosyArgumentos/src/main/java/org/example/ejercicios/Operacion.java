package org.example.ejercicios;

public class Operacion {

    int suma;
    int resta;
    int multiplicacion;
    int division;
    public void sumar(int numero1, int numero2){
        suma=numero1+numero2;
    }

    public void restar(int numero1, int numero2){
        resta=numero1-numero2;
    }

    public void multiplicar(int numero1, int numero2){
        multiplicacion=numero1*numero2;
    }

    public void dividir(int numero1, int numero2){
        division=numero1/numero2;
    }

    public void mostrarResultados(){
        System.out.println("The add of the numbers is: "+suma);
        System.out.println("The substraction of the numbers is: "+resta);
        System.out.println("The multiplication of the numbers is: "+multiplicacion);
        System.out.println("The division of the numbers is: "+division);
    }
}
