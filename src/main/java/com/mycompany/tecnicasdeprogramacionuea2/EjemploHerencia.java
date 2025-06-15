package com.mycompany.tecnicasdeprogramacionuea2;

// Clase base o superclase
class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

// Clase derivada o subclase que hereda de Persona
class Estudiante extends Persona {
    int edad;

    public Estudiante(String nombre, int edad) {
        super(nombre); // Llama al constructor de la superclase
        this.edad = edad;
    }

    public void mostrarEdad() {
        System.out.println("Edad: " + edad);
    }
}

public class EjemploHerencia {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Heidy", 19);
        estudiante.mostrarNombre();  // Método heredado de Persona
        estudiante.mostrarEdad();    // Método propio de Estudiante
    }
}

