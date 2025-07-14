/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Construtores_Java;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Crear personas usando el constructor
        Persona persona1 = new Persona("Belen", 13);
        Persona persona2 = new Persona("Jonathan", 29);
        Persona persona3 = new Persona("Daniela", 15);

        System.out.println("Persona 1:");
        persona1.mostrarInformacion();
        System.out.println();

        System.out.println("Persona 2:");
        persona2.mostrarInformacion();
        System.out.println();

        System.out.println("Persona 3:");
        persona3.mostrarInformacion();

        System.out.println("Datos registrados con éxito.");
    }
}

