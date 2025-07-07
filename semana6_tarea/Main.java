/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana6_tarea;

/**
 *Modificado para que Git lo detecte
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("La noche estrellada de butterflies", "Sofia Molina Santander", 1980, 456);
        Revista revista = new Revista("La cienca ficción", "Johana Meza", 2024, 14);

        System.out.println("Detalles del libro:");
        libro.mostrarDetalles();

        System.out.println("\nDetalles de la revista:");
        revista.mostrarDetalles();
    }
}

