package com.mycompany.tecnicasdeprogramacionuea2;

// Clase abstracta
abstract class Animal {
    public abstract void sonido();
}

// Subclase que implementa el método abstracto
class Gato extends Animal {
    @Override
    public void sonido() {
        System.out.println("El gato maúlla");
    }
}

public class EjemploAbstraccion {
    public static void main(String[] args) {
        Animal miGato = new Gato();
        miGato.sonido();  // Salida: El gato maúlla
    }
}
    

