/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoRealPOO;

import java.util.Scanner;

/**
 * Clase que representa el restaurante y gestiona el menú y pedidos.
 */
public class Restaurante {
    private Plato[] menu;

    // Constructor que inicializa el menú con platos
    public Restaurante() {
        menu = new Plato[3];
        menu[0] = new Plato("Arroz con camaron", 8.00);
        menu[1] = new Plato("Seco de pato", 4.50);
        menu[2] = new Plato("Ceviche", 9.75);
    }

    // Muestra el menú del restaurante
    public void mostrarMenu() {
        System.out.println("Menú del Restaurante:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getNombre() + " - $" + menu[i].getPrecio());
        }
    }

    // Procesa el pedido de un cliente
    public void tomarPedido(int opcion, Cliente cliente) {
        if (opcion >= 1 && opcion <= menu.length) {
            Plato platoSeleccionado = menu[opcion - 1];
            System.out.println("El cliente " + cliente.getNombre() +
                " ha pedido: " + platoSeleccionado.getNombre() +
                " por $" + platoSeleccionado.getPrecio());
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();

        System.out.println("Bienvenidos a este aventura gastronomica digital.");
        restaurante.mostrarMenu();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        Cliente cliente = new Cliente(nombre);

        System.out.print("Ingrese el número del plato que desea ordenar: ");
        int opcion = scanner.nextInt();

        restaurante.tomarPedido(opcion, cliente);

        scanner.close();
    }
}


