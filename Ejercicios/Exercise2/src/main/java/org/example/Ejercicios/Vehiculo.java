package org.example.Ejercicios;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    //CONSTRUCTOR
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: "+marca+"\n Modelo "+modelo+"\n precio \n";
    }
}
