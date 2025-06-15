package com.mycompany.tecnicasdeprogramacionuea2;

public class EjemploEncapsulacion {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public EjemploEncapsulacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {  // Validación simple
            this.edad = edad;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        EjemploEncapsulacion persona = new EjemploEncapsulacion("Heidy", 19);
        persona.mostrarInformacion();

        // Cambiamos la edad usando el setter
        persona.setEdad(20);
        persona.mostrarInformacion();
    }
}

