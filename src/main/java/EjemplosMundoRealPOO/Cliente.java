/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoRealPOO;

/**
 * Clase que define a un cliente del restaurante, incluyendo su nombre.
 * Almacena el nombre del cliente que realizo el pedido 
 */
public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

