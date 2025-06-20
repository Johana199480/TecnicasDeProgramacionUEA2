/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoRealPOO;

/**
 *Clase indica un plato del menú del restaurante. 
 *Consta con el nombre del plato y su precio.
 */
public class Plato {
    private String nombre;
    private double precio;

    // Constructor
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Obtener el nombre del plato
    public String getNombre() {
        return nombre;
    }

    // Obtener el precio del plato
    public double getPrecio() {
        return precio;
    }
}
   
