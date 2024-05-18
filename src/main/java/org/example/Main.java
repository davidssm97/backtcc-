package org.example;

import org.example.modelos.Vehiculo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        Vehiculo vehiculoDos = new Vehiculo(5,"mazda",LocalDate.now(),300.0,"negro","mazda ultimo modelo","automovil",300,400.0,200);


        //llamamos al metodo set
        vehiculo.setMarca("volvo");
        vehiculo.setAutonomia(500);


        System.out.println("El nombre del vehiculo 2: "+ vehiculo.getMarca());
        System.out.println("la autonomia es: " + vehiculo.getAutonomia());
    }
}