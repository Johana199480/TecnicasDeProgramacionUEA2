/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Construtores_Java;

/**
 *Clase Persona que represente una persona con nombre y edad 
 * 
 */
public class Persona {
    private String nombre;
    private int edad;

    /**
     * Constructor que inicializa nombre y edad.
     * @param nombre Nombre de la persona.
     * @param edad Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Muestra la información de la persona.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}
 
    

